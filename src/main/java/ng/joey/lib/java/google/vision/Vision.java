package ng.joey.lib.java.google.vision;

import com.google.gson.Gson;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import ng.joey.lib.java.google.vision.entity.request.AnnotateImageRequest;
import ng.joey.lib.java.google.vision.entity.request.Feature;
import ng.joey.lib.java.google.vision.entity.request.Image;
import ng.joey.lib.java.google.vision.entity.request.ImageContext;
import ng.joey.lib.java.google.vision.entity.response.AnnotateImageResponse;

/**
 * A simple library for using Google's <a href="https://cloud.google.com/vision/">Cloud Vision Api</a>.
 * Static methods allow you to make a simple call with your api key and few parameters and get the results
 * in encapsulated classes.
 * <br>
 * Google: <br>
 * <i>Google Cloud Vision API enables developers to understand the content of an image by encapsulating powerful machine
 * learning models in an easy to use REST API. </i>
 * <br>
 * @see <a href="https://cloud.google.com/vision/">Cloud Vision Api</a>
 * @see <a href="https://cloud.google.com/vision/docs/quickstart">Quicstart</a>
 */
public class Vision {

    /**
     *  Call this to test the vision api. Please use a server key from your google cloud console project.
     * @param apiKey your api key from google cloud console.
     * @return a {@link Response} object containing the results of this vision request
     * @throws IOException if an error occurs during the request. This would however not be from the vision api
     * itself. For errors thrown by the api, parse the {@link Response} and look at the {@link AnnotateImageResponse#error}
     * items.
     */
    public static Response test(String apiKey) throws IOException{
        Request request = new Request(
                new AnnotateImageRequest[]{
                        new AnnotateImageRequest(
                                new Image(
                                        new Image.ImageSource("gs://joey-ng.appspot.com/fruit-bowl-1600023_1920.jpg", null)
                                ),
                                new Feature[]{
                                        new Feature(Feature.Type.LABEL_DETECTION),
                                        new Feature(Feature.Type.LOGO_DETECTION),
                                        new Feature(Feature.Type.WEB_DETECTION)
                                }

                        )
                }
        );

        System.out.println("Starting request...");
        Long start = System.currentTimeMillis();
        System.out.println("Started at "+start);
        try {
            Response response = analyze(request, apiKey);
            Long end = System.currentTimeMillis();
            Long diff = end - start;
            float time = diff / 1000f;
            System.out.println("Took "+time+"s");
            System.out.println("Response is: ");
            String resp = new Gson().toJson(response);
            System.out.println(resp);
            return response;
        } catch (IOException e) {
            System.out.println("Exception loading response, is: "+e.getMessage());
            e.printStackTrace();
            throw e;
        }
    }

    private static final String BASE_URL = "https://vision.googleapis.com/v1/images:annotate";

    /**
     * Call to analyze a new request
     * This method is synchronous and would block the calling thread. Please wrap in separate if you're calling
     * from a <b>Main</b> or <b>Ui-thread</b>
     * @param annotateImageRequest contains the parameters for the request
     *                             @see {@link AnnotateImageRequest}
     * @param apiKey your api key from google cloud console.
     * @return a {@link Response} object containing the results of this vision request
     * @throws IOException if an error occurs during the request. This would however not be from the vision api
     * itself. For errors thrown by the api, parse the {@link Response} and look at the {@link AnnotateImageResponse#error}
     * items.
     */
    public static Response analyze(Request annotateImageRequest, String apiKey) throws IOException {

        String builder = BASE_URL +
                "?" +
                "key=" +
                apiKey;

        HttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost(builder);
        post.setHeader("ContentType", "application/json");
        StringEntity entity = new StringEntity(new Gson().toJson(annotateImageRequest));
        post.setEntity(entity);
        HttpResponse response = client.execute(post);
        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));

        StringBuilder result = new StringBuilder();
        String line = "";
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }

        int statusCode = response.getStatusLine().getStatusCode();
        if(statusCode!=200)
            throw new IOException("Error "+statusCode +" : "+result.toString());
        String json = result.toString();

        return new Gson().fromJson(json, Response.class);
    }


    public static class Request {

        /**
         * @see {@link AnnotateImageRequest}
         */
        public AnnotateImageRequest[] requests;

        /**
         * Constructor
         * @param requests @see {@link AnnotateImageRequest}
         */
        public Request(AnnotateImageRequest[] requests) {
            this.requests = requests;
        }
    }

    public static class Response {

        /**
         * @see {@link AnnotateImageResponse}
         */
        public AnnotateImageResponse[] responses;

    }



}
