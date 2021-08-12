# sing-code-assignment
package-solution1.animal
=================
1. Can you implement the sing() method for the bird? - Implemented.
   1. How did you unit test it? 
        - We can call the sing() method from the test file(BirdTest.java) but cannot actually assert anything as this method call does not have any effect/return anything in the code to assert with.
        - if this method was called from any of the Mock object then we can use verify() from mockito lib to check if the method was called and how many times it is called.
   2. How did you optimize the code for maintainability?
        - we can optimize the code in few ways
            1. walk() method is having default definition in Animal class which may not be applicable for all the animal types. so we can have abstract super class or interface with only method declarations and let subclass define the method as per the need.
            2. there is no design pattern followed. we can implement Factory pattern to centralize creating sub class objects which makes the code easy to maintain and understand.
            3. Solution class is instantiating the Bird class and assigning it to the Bird reference type. instead we should assign it to the Animal Class so that any change in the actual object will not impact the reference.
            
section A: package-solution2.animal
============================
2. Duck & Chicken
    - The proposed design re structured the hierarchy in such a way that it can be extended to add more functionality 
    - the proposed design adhers to Interface Segregation principle of SOLID principles. low level implementation class like Duck and Chicken can implement only the method it is interested in. for example Duck interested in swimming so implements Swimmable interface where as Chicken not interested in swimming and not required to implement.
3. 
    - rooster is male version of chicken. so it is related by its sex.
    - since it is asked to create a rooster model without inheritance relationship, sing method is implemented by checking the sex. where sex is an enum defined in Animal class because all the animals can have sex type. sex enum cannot be defined in a separate file because switch case statement does not allow qualified enum in case for example Sex.MALE is not allowed.
    - BirdsFactory.java class is added to create different birds based on the request. this makes the code easy to maintain.
    - BirdsClient.java,BirdsClientTest.java class is added to test the sing method based on the chicken sex.
4. 
    - Parrot changes its sound depending on which animal it lives with.
    - Adaptor pattern is used to produce a parrot with different behaviour based on which Animal it lives with. Note-if this is an additional feature to be added during runtime then Decorator pattern could have been used.
    - if a parrot lives with Duck or Phone, we can add a new method in ParrotAdaptor.java & ParrotAdaptorImpl.java to produce a parrot with new sound rather than creating a new Parrot child class.
    - ParrotAdaptorClient.java & ParrotAdaptorClientTest.java class is added to test the sing method of parrot lives with different animals.
    
section B: package-solution2.animal
============================    
1. 
    - fish cannot walk or sing but can swim. and other swimming animals expected to create. so created a SwimmingAnimal class which extends Animal and Implements Swimmable
2. 
    - implemented Decorator Pattern to create a specialized fish like Shark and Clown,
    - Shark and Clown fish requires additional features like color and size but those are non functional and kind of adding additional decoration to the basic fish. so did not add a separate child class for these special fish creation.
    - basic fish is wrapped in the FishDecorator class to add special behaviours like eat() and makejokes()
    - FishClient.java and FishClientTest.java files added to test the different fish color, size and behaviours.
3.  
    - Dolphins are not fish but can swim. so Dolphin directly extends SwimmingAnimal.
    - in general, duplicate codes can be avoided by adding the common behaviours and properties to the possible base class level.in the current implementation, almost no codes are duplicated.   

section C: package-solution2.animal
============================      
1. 
    - butterfly can fly but cannot make sound. so created a common Insect class which extends Animal and implements Flyable interface. Butterfly class extends Insect
2. 
    - created a caterpillar class which extends Animal and implements Walkable interface.
    - created a util class TransformInsectUtil.java to metapmorphosis from butterfly to caterpillar and created a test class TransformInsectUtilTest.java

section D: package-solution2.animal
============================   
 1. 
    - Cat, Dog and Frog class is added.
    - AnimalFactory class is added to create different animal instant based on the type
    - AnimalClient class is added which gets the animal instants and prints the no of walkable, flyable, singable, swimmable animals.
    - AnimalClientTest class is added to test the AnimalClient class.

Bonus: package-solution2.animal
============================
1. 
    - Translations class is added and considered as translation source which has a static nested map(multimap can also be used) with animal type and language as keys 
    - TranslationService class is created and added to Animal class with composite relation to help get the translations from translation source
    - added a overloaded sing(lang) method in Chicken class which takes lang as an argument and sings accordingly.
    - ChickenTest and TranslationServiceTest classes are added for unit testing.
2.
    - Rest Api is developed to fetch all the animals. change includes,
        - packages are restructured a bit to fit into to web project architecture.
        - introduced spring boot web starter dependency in pom.xml file
        - added a AnimalApp with @SpringBootApplication annotation to run the app as a spring boot app.
        - added AnimalController class, AnimalService interface, AnimalServiceImpl class,Response & MetaInfo class
        - added a test file for each class-AnimalApp, AnimalControllerTest, AnimalServiceTest
        - added AnimalIntegrationTest class for integration testing the Api flow.
        - loggers added
        - improvements: custom exception, custom error codes & descriptions, swagger documentations can be added as an enhancements.