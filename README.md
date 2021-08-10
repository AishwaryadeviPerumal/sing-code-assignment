# sing-code-assignment
solution1.animal
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
            
solution2.animal
==================
2. Duck & Chicken
    - The proposed design re structured the hierarchy in such a way that it can be extended to add more functionality 
    - the proposed design adhers to Interface Segregation principle of SOLID principles. low level implementation class like Duck and Chicken can implement only the method it is interested in. for example Duck interested in swimming so implements Swimmable interface where as Chicken not interested in swimming and not required to implement.
3. 
    - rooster is male version of chicken. so it is related by its sex.
    - since it is asked to create a rooster model without inheritance relationship, sing method is implemented by checking the sex. where sex is an enum defined in Animal class because all the animals can have sex type. sex enum cannot be defined in a separate file because switch case statement does not allow qualified enum in case for example Sex.MALE is not allowed.
    - BirdsFactory.java class is added to create different birds based on the request. this makes the code easy to maintain.
    - BirdsClient.java,BirdsClientTest.java class is added to test the sing method based on the chicken sex.