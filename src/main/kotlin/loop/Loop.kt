package org.example.loop

class Loop {
}
fun main(){

    //범위 반복
    //for 문의 경우 자바보다 더 간결해졌다
    for(i in 0..10){
        print("$i ")
    }
    for(i in 1..9 step 3) //3씩 뛰어넘는다
        break
    for(i in 10 downTo 0){
        break
        //감소하며 반복
    }
    println()

    var arr = arrayOf(1,2,3,4,5)

    for(i in arr){
        print("$i ")
    }
    println()

    var count = 0

    while(count < 5){
        print("${count++} ")
        if(count == 3){
            continue
        }
    }
    println()

    count = 0
    do{
        print("${count++} ")
        if(count == 3){
            break
        }
    }while (count < 5)
    println()



    //2중 for문에서 특정 조건에 반복문을 빠져나오고 싶을 경우
    for(i in 1..10){
        for(j in 1..10){
            println("i = $i , j = $j")
            if(i == 3 && j ==3) break
        }
        if(i == 3) break
        //이렇게 두번 체크해줘야하지만
    }
    //해당 labe을 지정하여 한번에 이중포문을 빠져나올 수 있다
    loop@for(i in 1..10){
        for(j in 1..10){
            println("i = $i , j = $j")
            if(i == 3 && j ==3) break@loop
        }
    }

}