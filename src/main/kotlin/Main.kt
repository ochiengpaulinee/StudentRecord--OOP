fun main(){
    var student = Student("Lilian",18, grades = mutableListOf(75,80,44,20))
    println(student.averageGrade())
    println(student.studentInfo())
    println(student.studentPass())
}

class Student(var name:String,var age:Int,var grades:MutableList<Int>){
    fun averageGrade():Double{
        var sum = 0
        for(grade in grades){
            sum+=grade
        }
        return (sum.toDouble()/grades.size)
    }

    fun studentInfo():String{
        return "name:${name}, age:${age}, averageGrade:${averageGrade()}"
    }

    fun studentPass(){
        if(averageGrade()>=50){
            println("Pass")
        }
        else{
            println("fail")
        }
    }
}
