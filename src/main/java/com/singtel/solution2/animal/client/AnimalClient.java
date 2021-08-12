package com.singtel.solution2.animal.client;

import com.singtel.solution2.animal.factory.AnimalFactory;
import com.singtel.solution2.animal.model.*;

import java.util.HashMap;
import java.util.Map;

import static com.singtel.solution2.animal.util.Constant.*;

public class AnimalClient {

    public static void main(String[] args){
        AnimalClient client=new AnimalClient();
        Map<String,Integer> countMap=client.getAnimalTypeCount(client.populateAnimals());
        client.printAnimalCount(countMap);
    }

    private Animal[] populateAnimals(){
        return new Animal[]{
                AnimalFactory.getAnimal("BIRD"),
                AnimalFactory.getAnimal("DUCK"),
                AnimalFactory.getAnimal("CHICKEN"),
                AnimalFactory.getAnimal("ROOSTER"),
                AnimalFactory.getAnimal("PARROT"),
                AnimalFactory.getAnimal("FISH"),
                AnimalFactory.getAnimal("SHARK"),
                AnimalFactory.getAnimal("CLOWNFISH"),
                AnimalFactory.getAnimal("DOLPHIN"),
                AnimalFactory.getAnimal("FROG"),
                AnimalFactory.getAnimal("DOG"),
                AnimalFactory.getAnimal("BUTTERFLY"),
                AnimalFactory.getAnimal("CAT")
        };
    }
    private Map<String,Integer> getAnimalTypeCount(Animal[] animals){
        Map<String,Integer> countMap=new HashMap<>();
        for(int i=0;i<animals.length;i++){
            Animal animal=animals[i];
            if(animal instanceof Walkable)
                addCount(countMap,WALKABLE);
            if(animal instanceof Flyable)
                addCount(countMap,FLYABLE);
            if(animal instanceof Swimmable)
                addCount(countMap,SWIMMABLE);
            if(animal instanceof Singable)
                addCount(countMap,SINGABLE);
        }
        return countMap;
    }
    private void addCount(Map<String,Integer> countMap,String type){
        if(countMap.containsKey(type)){
            countMap.put(type,countMap.get(type).intValue()+1);
        }else{
            countMap.put(type,1);
        }
    }
    private void printAnimalCount(Map<String,Integer> countMap){
        for(Map.Entry<String,Integer> entry: countMap.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
