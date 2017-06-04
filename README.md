# googlecloudvision-api-java
#### Simple *ApiKey-friendly* Java library for Google's Cloud Vision Api

## What this is.

Google's Cloud Vision Api lets you analyze images and figure out what's in there, this library helps you do that with 
less json parsing & coding.

Here's their description:

>Google Cloud Vision API enables developers to understand the content of an image by encapsulating powerful machine learning 
>models in an easy to use REST API. It quickly classifies images into thousands of categories 
>(e.g., "sailboat", "lion", "Eiffel Tower"), detects individual objects and faces within images, and finds and reads printed 
>words contained within images. You can build metadata on your image catalog, moderate offensive content, or enable new 
>marketing scenarios through image sentiment analysis. Analyze images uploaded in the request or integrate with your image 
>storage on Google Cloud Storage. 

## How to use this.

To make use of this, first you need a Google Cloud project, and an Api-key:

First, login to your google account at [Google Cloud Console](https://console.cloud.google.com).

Next, follow the steps on Google's quickstart tutorial [here](https://cloud.google.com/vision/docs/before-you-begin) 
to enable the Api.

Next, you need an Api key. Follow the steps required [to create an Api Key for your project](https://support.google.com/cloud/answer/6158862?hl=en).
These keys are usually in the form
>Alza...............................

When you have your key, just create a new `RequestObject` instance, and fill in the required params,

```java
//create a new request
Request request = new Request(
                //embed a list of AnnotateImageRequest's
                new AnnotateImageRequest[]{
                        new AnnotateImageRequest(
                                //add an image source
                                new Image(
                                        new Image.ImageSource("gs://joey-ng.appspot.com/fruit-bowl-1600023_1920.jpg", null)
                                ),
                                
                                //and a list of features to detect
                                new Feature[]{
                                        new Feature(Feature.Type.LABEL_DETECTION),
                                        new Feature(Feature.Type.LOGO_DETECTION),
                                        new Feature(Feature.Type.WEB_DETECTION)
                                }

                        )
                }
        );
```
        
after which getting your response is as easy as calling a single line of code:

```java
Response response = Vision.analyze(request, apiKey);
System.out.println(new Gson().toJson(response));
```

The `Response` object contains the Json response encapsulated into simple helper classes. Here's how to access a few:

```java
//Detected Labels
List<EntityAnnotation> labelAnnotations = response.responses[0].labelAnnotations;
EntityAnnotation firstAnnotation = labelAnnotations.get(0);
System.out.println("First label description: "+firstAnnotation.description);
...
//Detected Logos
List<EntityAnnotation> logoAnnotations = response.responses[0].logoAnnotations;
EntityAnnotation firstAnnotation = logoAnnotations.get(0);
System.out.println("First logo description: "+firstAnnotation.description);
...
//Detected Web entities
List<WebDetection.WebEntity> webEntities = response.responses[0].webDetection.webEntities;
WebDetection.WebEntity firstWebEntity = webEntities.get(0);
System.out.println(firstWebEntity.description);

```
## Debugging

If the Cloud Vision Api returns with an error, you can find it in the same `Response` object like so:

```java
AnnotateImageResponse.Status status = response.responses[0].error;
int statusCode = status.code;
String errorMessage = status.message;
```

To get a grasp on how to make good use of this Google magic, I suggest, my dear friend, that you thoroughly go through their 
[documentation](https://cloud.google.com/vision/docs). It is quite good after all.

### Other stuff

Feel free to fork this and do whatever you want to do with it. 
