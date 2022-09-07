class Person{
    var name: String
    var cpf: String
    var datanasc: String
    
     constructor (_name:String,_cpf:Int){
       	this.name = _name
        this.cpf = _cpf
    }
}

class Aluno : Person {
    var nota1 : Double
    var nota2: Double
    var nota3: Double
    var nota4: Double
    
    constructor (_name:String,_cpf:String,_nota1:Double,_nota2:Double,_nota3:Double,_nota4:Double): super(_name,_cpf){
        this.nota1=_nota1
        this.nota2=_nota2
        this.nota3=_nota3
        this.nota4=_nota4
    }
    
    open fun calcMedia () : Double{
        return ((nota1 + nota2 + nota3 + nota4) / 4)
     }
    
    open fun infoAluno () : String{
        return _name, _cpf
    }
}

class Professor : Person {
    constructor (_name:String,_cpf:Int)super(_name,_cpf){
            this.name = _name
            this.cpf = _cpf
    }
    open fun infoProfessor() : String{
        return _name,_cpf
    }
}

class Teste {
	
    

}