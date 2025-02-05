package org.example.service.model;


import java.util.Date;
import java.util.List;

/**
 * Clase recor de respuest del servicio de marvel.
 * @param code variable de respuesta de marvel.
 * @param status variable de respuesta de marvel.
 * @param copyright variable de respuesta de marvel.
 * @param attributionText variable de respuesta de marvel.
 * @param attributionHTML variable de respuesta de marvel.
 * @param etag variable de respuesta de marvel.
 * @param data variable de respuesta de marvel.
 */
public record Marvelresponse(int code,
                             String status,
                             String copyright,
                             String attributionText,
                             String attributionHTML,
                             String etag,
                             Data data) {
    public record Data(String offset,
                       String limit,
                       String total,
                       String count,
                       List<Results> results){
        public record Results(
                int id,
                String name,
                String description,
                Date modified,
                Thumbnail thumbnail,
                String resourceURI,
                Comics comics,
                Series series,
                Stories stories,
                Events events,
                List<Url> urls){
            public record  Thumbnail(String path, String extension){}
            public record  Comics(
                    int available,
                    String collectionURI,
                    List<Item> items,
                    int returned){
                public record Item(String resourceURI,String name,String type){}
            }
            public record  Series(
                    int available,
                    String collectionURI,
                    List<Comics.Item> items,
                    int returned){
                public record Item(String resourceURI,String name,String type){}
            }
            public record Stories (
                    int available,
                    String collectionURI,
                    List<Comics.Item> items,
                    int returned){
                public record Item(String resourceURI,String name,String type){}
            }
            public record  Events(int available,
                                  String collectionURI,
                                  List<Comics.Item> items,
                                  int returned){
                public record Item(String resourceURI,String name,String type){}
            }
            public record  Url(String type, String url){}
        }

    }
}