package com.lucas.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Cliente.class)
public abstract class Cliente_ {

	public static volatile SingularAttribute<Cliente, String> tipo;
	public static volatile SingularAttribute<Cliente, String> cidade;
	public static volatile SingularAttribute<Cliente, String> telefone;
	public static volatile SingularAttribute<Cliente, String> endereco;
	public static volatile SingularAttribute<Cliente, Integer> numero;
	public static volatile SingularAttribute<Cliente, String> bairro;
	public static volatile SingularAttribute<Cliente, Date> datacadastro;
	public static volatile SingularAttribute<Cliente, String> nome;
	public static volatile SingularAttribute<Cliente, String> cpfcnpj;
	public static volatile SingularAttribute<Cliente, String> cep;
	public static volatile SingularAttribute<Cliente, String> uf;
	public static volatile SingularAttribute<Cliente, String> complemento;
	public static volatile SingularAttribute<Cliente, Long> id;
	public static volatile SingularAttribute<Cliente, String> email;
	public static volatile SingularAttribute<Cliente, String> status;

	public static final String TIPO = "tipo";
	public static final String CIDADE = "cidade";
	public static final String TELEFONE = "telefone";
	public static final String ENDERECO = "endereco";
	public static final String NUMERO = "numero";
	public static final String BAIRRO = "bairro";
	public static final String DATACADASTRO = "datacadastro";
	public static final String NOME = "nome";
	public static final String CPFCNPJ = "cpfcnpj";
	public static final String CEP = "cep";
	public static final String UF = "uf";
	public static final String COMPLEMENTO = "complemento";
	public static final String ID = "id";
	public static final String EMAIL = "email";
	public static final String STATUS = "status";

}

