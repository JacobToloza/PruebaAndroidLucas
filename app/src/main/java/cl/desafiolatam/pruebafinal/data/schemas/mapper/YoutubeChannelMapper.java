package cl.desafiolatam.pruebafinal.data.schemas.mapper;

import cl.desafiolatam.pruebafinal.data.schemas.YouTubeChannelSchema;
import cl.desafiolatam.pruebafinal.domain.model.DomainModel;

public class YoutubeChannelMapper {

    //YoutubeChannelSchema -> DomainModel
    public DomainModel mapShemaToModel(YouTubeChannelSchema schema){
        return new DomainModel(schema.getNombre(), schema.getType(), schema.getDescripcion(),
                schema.getVideoUrl(), schema.getImageUrl(), schema.getFecha());
    }

    //DomainModel -> YoutubeChannelSchema
    public YouTubeChannelSchema domainToModel(DomainModel model) {
        return new YouTubeChannelSchema(model.getNombre(), model.getType(), model.getDescripcion(),
                model.getVideoUrl(), model.getImageUrl(), model.getFecha());

    }


}
