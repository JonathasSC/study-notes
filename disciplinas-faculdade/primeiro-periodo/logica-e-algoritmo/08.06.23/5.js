function verFatorial(numero){
    const num = numero

    if (numero === 0 || numero === 1){
        return 1;
    } else {
        let resultado = numero;
        while (numero > 1){
            resultado *= (numero - 1)
            numero--
        }
        console.log(`${num}! = ${resultado}`)
    }
}

verFatorial(5)
