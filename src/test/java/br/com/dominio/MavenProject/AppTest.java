package br.com.dominio.MavenProject;

import static org.junit.Assert.*;

import org.junit.*;



public class AppTest{ 
	String nome = "kelson";
	String sexo = "masculino";
	String matricula = "81011028";
	String caso1 = "LCC";
	String caso2 = "SI";
	char[] juntanome = {'k','e','l','s','o','n'};
	String nome1 = new String(juntanome);
	int idade = 22;
    @Test
    public void testApp(){
    
    	assertEquals(nome, "kelson");
		assertEquals(sexo, "masculino");
		assertEquals(matricula, "81011028");
		System.out.println(caso1.equalsIgnoreCase(caso2));
		assertEquals(nome1, "kelson");
		assertEquals(idade, 22);
        
    }
}
