package model;

public class pessoa {
//atributos
String cpf;
String nome;
int idade;

//métodos
// construtor metodo que tem o mesmo nome da classe
public pessoa(String cpf, String nome, int idade) {
    this.cpf = cpf; 
    this.nome =  nome;
    this.idade = idade;
}
//Getters and Setters
public void setCpf(String cpf){
    this.cpf = cpf;
}

public String getNome(){
    return this.nome;
}
public void setIdade(int idade){
    this.idade = idade;
}
public int getIdade(){
    return this.idade;
}
}