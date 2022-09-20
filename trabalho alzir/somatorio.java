contador
<script>
    var n =Number(prompt("irforma a quantidade de numero:"))
    var numero;
    var cont=0;
    var i=1;
    while(i<=n){
        numero=Number(prompt("informe o numero "))
        if(Number.isInteger(numero)){
            cont = cont + 1
        }


        i++
    }
    console.log(cont)

</script> 

somatorio

<script>

var n = prompt("Digite a quantidade de números");

var num;
var soma = 0;
var i = 0;

while(i < n){
    i++;
    num = Number(prompt("Digite um número"));
    soma += num;
}

console.log("A somas dos" +n+ "números é igual a:" + soma)
</script>

fibonnaci

<script>

    var n = prompt("Digite o número de termos")
    
    var a = 0;
    var b = 1;
    var i = 2;
    
    while(i < n){
        console.log(a + ", " + b + ", ");
        a += b;
        b += a;
        i += 2;
    }
    
    if(i == n){
        console.log(a + ", " + b)
    }else{
        console.log(a)
    }
    
    </script>
  
 mdc

<script>
    var num1 = parseInt(prompt("digite um numero"));
    var num2 = parseInt(prompt("digite outro numero"));
    var aux=0
    if(num1>num2){
        aux = num1
        num1 =num2
        num2 = aux
    }
	
		do {
			resto = num1%num2
            num1 = num2
            num2 = resto
			
		}
        while(resto!=0)
        console.log("MDC = " + num1);
 </script>

 ordenaçao

<script>
    var vetor = [1,23,5,56,24,35];
    var aux=0;
    for( let i = 0; i < vetor.length; i++){
        for(let j = 0; j < vetor.length; j++){
           if(vetor[i]<vetor[j]){
            aux = vetor[i];
            vetor[i] =vetor[j];
            vetor[j] = aux;
           }
        }
     
    }
    for(k=0;k<vetor.length;k++){
            console.log(vetor[k]);
    }
</script>

 contador java

package entregravel;

import java.util.Scanner;

public class Contagem {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("digite um numero:");
		int num1 = input.nextInt();
		int soma = 0;
		
		System.out.println("soma dos numeros é:");
		for(int i = 1; i <= num1; i++) {
			soma += i;
			System.out.println(soma);
		}
		input.close();
	}
}

fibonacci java

package entregravel;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("digite um numero:");
		int value = input.nextInt();
		
		int[] vetor = new int[value];
		
		for(int i = 0; i <= value; i++) {
			System.out.println("(" + i + ") >> " + Fibonacci.fibo(i));
		}
		input.close();
	}
	static long fibo(int n) {
		if(n < 2) {
			return n;
			
		} else {
			return fibo(n - 1) + fibo(n - 2);
		}
	}
}

primo. java

package entregravel;

import java.util.Scanner;

public class Numero_primo {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Insira um numero:");
		int numero = input.nextInt();
		int divisores = 0;
		
		for(int i = 1; i <= numero; i++) {
			if(numero % i == 0) {
				divisores++;
			}
		}
		
		if(divisores == 2) {
			System.out.println("é primo!");
			
		} else {
			System.out.println("Nao é primo!");
		}
		input.close();
	}
}

ordenaçao
package entregravel;

public class Ordenarçao {
	public static void main(String[] args) {
				
		int[] vetor = new int[10];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) Math.floor(Math.random() * vetor.length);
			
		}
		System.out.println("Messy");
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i] + " ");	
		}
		quicksort(vetor, 0, vetor.length - 1);
		
		System.out.println("\n\nTidy up");
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i] + " ");	
		}
	}
	static void quicksort(int[] vetor, int left, int right) {
		if(left < right) {
			int p = piece(vetor, left, right);
			quicksort(vetor, left, p);
			quicksort(vetor, p + 1, right);	
		}
	}
	static int piece(int[] vetor, int left, int right) {
		int meio = (int) (left + right) / 2;
		int pivo = vetor[meio];
		int i = left - 1;
		int j = right + 1;
		
		while(true) {
			do {
				i++;
			} while(vetor[i] < pivo);
			do {
				j--;
			} while(vetor[j] > pivo);
				
				if(i >= j) {
					return j;	
				}
				int aux = vetor[i];
				vetor[i] = vetor[j];
				vetor[j] = aux;
			}
		}
}

somatoriio java

package entregravel;

import java.util.Scanner;

public class Somatario {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number:");
		int num1 = input.nextInt();
		System.out.println("Enter one more number:");
		int num2 = input.nextInt();
		
		int calcular = num1 + num2;
		
		System.out.println("a soma dos numeros é: " + calcular);
		
		input.close();
	}
}