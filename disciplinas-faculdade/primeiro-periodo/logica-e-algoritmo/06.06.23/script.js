function amountToPay (entrada,saida){
    let valor

    let hora_entrada = entrada[0]
    let min_entrada = entrada[1]
    let hora_saida = saida[0]
    let min_saida = saida[1]

    let min_total_entrada = hora_entrada * 60 + min_entrada
    let min_total_saida = hora_saida * 60 + min_saida

    let min_permanecidos = min_total_saida - min_total_entrada

    if (min_permanecidos < 0){
        let min_decimal = Math.abs(min_permanecidos) / 60 - 24;
        formatado = new Date(min_decimal * 3600 * 1000)
        .toISOString().substring(11, 16)

    } else {
        let min_decimal = min_permanecidos / 60
        formatado = new Date(min_decimal * 3600 * 1000)
        .toISOString().substring(11, 16)

    }

    let hora = parseInt(formatado.substring(0,2))
    let min = parseInt(formatado.substring(3,5))

    if (hora <= 2){
        valor = 8.0;
    }

    if (hora == 2 && min > 00 || hora > 3 || hora == 3 && min > 0){
        valor = 8.5;
    }

    if (hora > 4 || hora == 3 && min > 0){
        tempo_excedido = hora - 4;
        valor = 8.5 + tempo_excedido * 2;
    }

    console.log(`Você passou ${hora}h${min}m\nValor: R$ ${valor}`)
}

amountToPay([00,50],[01,30])
amountToPay([12,50],[15,30])
amountToPay([12,50],[19,30])