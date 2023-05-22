package br.com.api.produtos.modelo;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

//com essa anotacao podemos utilizar a injecao de dependencias
//com ela a spring fica responsavel por instacia um obj do tipo da classe e nao o programador
@Component
@Getter
@Setter
public class RespostaModelo {
    
    private String mensagem;
    
}
