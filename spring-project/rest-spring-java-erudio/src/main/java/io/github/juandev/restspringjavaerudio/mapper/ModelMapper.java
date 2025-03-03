package io.github.juandev.restspringjavaerudio.mapper;

import java.util.ArrayList;
import java.util.List;

public class ModelMapper {

    //private static Mapper mapper = DozerBeanMapperBuilder.buildDefault();
    private static org.modelmapper.ModelMapper mapper = new org.modelmapper.ModelMapper();

    public static <O, D> D parseObject(O origin, Class<D> destination){
        return mapper.map(origin, destination);
    }

    public static <O, D> List<D> parseListObjectsObject(List<O> origin, Class<D> destination){
        List<D> destinationObjects = new ArrayList<D>();
        for (O o: origin){
            destinationObjects.add(mapper.map(o, destination));
        }
        return destinationObjects;
    }
}
