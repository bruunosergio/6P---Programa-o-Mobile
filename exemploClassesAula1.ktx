open class Person {
    var name: String 
    var age: Int
    
    constructor (_name:String,_age:Int){
        this.name = _name
        this.age = _age
    }
    fun maioridade():Boolean{
        return this.age>18
    }
}
open class Employee : Person {
    var salario: Double
    
    constructor (_name:String,_age:Int, _salario:Double): super(_name,_age){
        this.salario = _salario
    }
   open fun calcSalario() : Double{
        return salario * 1.10
    }
}

class Manager : Employee {
     constructor (_name:String,_age:Int, _salario:Double): super(_name,_age,_salario){
    }
     override fun calcSalario() : Double {
         return salario * 3
     }
}
 fun main (){   
   var pessoa1 = Manager("Joao",30,2000.0)
   var pessoa2 = Employee("Joao",30,2000.0)
   
     
     var list : ArrayList<Employee> = arrayListOf()
     list.add(pessoa1)
     list.add(pessoa2)
     
     print("${list.get(1).calcSalario()}\n")
     
   	 print("${pessoa1.age}\n")
  	 print("${pessoa1.calcSalario()}")
}