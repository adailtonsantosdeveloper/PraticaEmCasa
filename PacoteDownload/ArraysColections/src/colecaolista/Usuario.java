/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecaolista;

import java.util.Objects;

/**
 *
 * @author ADAILTON
 */
public class Usuario {
    
    String nome;
    int idade;
    Usuario() { } // Declarando o construtor padrão
    Usuario(String x) {
        nome = x; //O valor recebido no parâmetro será incluido na Instância "nome"
    }
    
    /**
     *
     * @param obj
     * @return
     */
    public boolean equals (Object obj){

	if (this == obj) {
		return true;
	}
	if (obj == null) {
		return false;
	}
	if (getClass() != obj.getClass()) {
		return false;
	}

	Usuario other = (Usuario) obj;

	if (nome == null) {
		if (other.nome != null) {
			return false;
		}
	} else if (! nome.equals(other.nome)) {
		return false;
	}
	return true;


}

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.nome);
        return hash;
    }
    
} // Serão criados "objetos" dessa classe dentro da classe [ColecaoLista]
