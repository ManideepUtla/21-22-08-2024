package functionDemo;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionService {

    // This is suppler function No Need to pass a i/p and it gives o/p
    //when we want all o/p we go for supplier
    Supplier<String> nameSupplier=()->{
      return "neoteric";
    };
    //both are same this here code complexity is less
    Supplier<String> nameSupplierLamda=()-> "neoteric";

    //employee Supplier
    Supplier<Employe> employeSupplier=()->{
        return new Employe("Manideep","Utla","9985533134",22);
    };

    //Car Supplier
    Supplier<Car> carSupplier=()-> new Car("AUDI","A6","2CR");


    // It is Method and we pass Function as Parameter
    public String nameUpperCaseWithFunctionParameter(Function<String,String> upper,String name){
        return upper.apply(name);
    }

    //Lamda function
    Function<String,String> nameUpperCaseFunct=(name)->{
        return name.toUpperCase();
    };

    //BiFunction
    BiFunction<String,String,String> biFunctionConcatFun=(fName,lName)->{
        return fName.concat(lName);
    };
    //method
    public String nameUpperCase(String name){
        return name.toUpperCase();
    }

    public static void main(String[] args) {
        FunctionService functionservice=new FunctionService();

        //---------------------Method-------------------------------
        String uppercaseName=functionservice.nameUpperCase("neoteric");
        System.out.println("o/p from method = "+uppercaseName);

        //---------------------Function-------------------------------
        String upperCaseFuncOut=functionservice.nameUpperCaseFunct.apply("neoteric");
        System.out.println("o/p from fn = "+upperCaseFuncOut);
        //---------------------Bi-Function-------------------------------
        String concatBiFunct=functionservice.biFunctionConcatFun.apply("Manideep"," Utla");
        System.out.println("Concatenation using BiFunction- "+ concatBiFunct);

        //---------------------Function passes a parameter-------------------------------
        String upperCaseUsingFunctionAsParam=functionservice.nameUpperCaseWithFunctionParameter(functionservice.nameUpperCaseFunct,"neoteric");
        System.out.println("o/p of Method, Which takes Function as Parameter- "+ upperCaseUsingFunctionAsParam);

        // -------------------------------------Suppliers-------------------------------------
        String nameFromSupplierlamda=functionservice.nameSupplierLamda.get();
        System.out.println("o/p from suppliers using lamda fn- "+ nameFromSupplierlamda);//code complexity is less

        String nameFromSupplier=functionservice.nameSupplier.get();
        System.out.println("o/p from supplier using function- "+ nameFromSupplier);//code complexity is high

        //Employee Supplier
        Employe employeFromSupplier=functionservice.employeSupplier.get();
        System.out.println("o/p from employee Supplier- "+ employeFromSupplier.getFirstName());
        System.out.println("o/p from employee Supplier- "+ employeFromSupplier.getLastName());
        System.out.println("o/p from employee Supplier- "+ employeFromSupplier.getMobileNo());
        System.out.println("o/p from employee Supplier- "+ employeFromSupplier.getAge());

        //Car Supplier
        Car carFromSupplier=functionservice.carSupplier.get();
        System.out.println("o/p from car Supplier- "+carFromSupplier.getNameOfTheCar());
        System.out.println("o/p from car Supplier- "+carFromSupplier.getModelOfTheCar());
        System.out.println("o/p from car Supplier- "+carFromSupplier.getPrice());

    }

}
