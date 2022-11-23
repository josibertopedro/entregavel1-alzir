

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
