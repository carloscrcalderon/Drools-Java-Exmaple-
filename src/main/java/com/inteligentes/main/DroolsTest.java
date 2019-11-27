package com.inteligentes.main;

import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;


import org.drools.compiler.compiler.DroolsParserException;
import org.drools.compiler.compiler.PackageBuilder;
import org.drools.core.RuleBase;
import org.drools.core.RuleBaseFactory;
import org.drools.core.WorkingMemory;

import com.inteligentes.model.Prestamo;

//Universidad el Bosque
//Sistemas Inteligentes
//Carlos Alberto Calderon Reyes





public class DroolsTest {



	public static void main(String[] args) throws DroolsParserException,
	IOException {
		
		interfaz();
		
		
		



	}

	public void executeDrools(Prestamo prestamo) throws DroolsParserException, IOException {

		PackageBuilder packageBuilder = new PackageBuilder();

		String ruleFile = "/com/rule/Rules.drl";
		InputStream resourceAsStream = getClass().getResourceAsStream(ruleFile);

		Reader reader = new InputStreamReader(resourceAsStream);
		packageBuilder.addPackageFromDrl(reader);
		org.drools.core.rule.Package rulesPackage = packageBuilder.getPackage();
		RuleBase ruleBase = RuleBaseFactory.newRuleBase();
		ruleBase.addPackage(rulesPackage);

		WorkingMemory workingMemory = ruleBase.newStatefulSession();


		

		//facts
		Prestamo prestamo1 = new Prestamo(81,81,81,81,81,81,81,81,81,0);
		Prestamo prestamo2 = new Prestamo(72,81,49,69,49,84,43,40,40,0);
		Prestamo prestamo3 = new Prestamo(81,81,70,81,90,60,81,81,81,0);
		Prestamo prestamo4 = new Prestamo(81,20,81,81,81,81,38,81,81,0);

		//reglas:/src/main/resources/com/rule/Rules.drl


		//inference visit: https://dzone.com/articles/learn-drools-part-4-inferences
		workingMemory.insert(prestamo);

		workingMemory.fireAllRules();

		System.out.println("En memoria: " + workingMemory.getFactCount());

		JOptionPane.showMessageDialog(null, "La aprobacion del credito es:  " + prestamo.getPorcentaje() +"%");
		interfaz();


	}

	
	public static void interfaz() throws DroolsParserException, IOException {
		Prestamo prestamo=new Prestamo();


		JTextField field1 = new JTextField();
		JTextField field2 = new JTextField();
		JTextField field3 = new JTextField();
		JTextField field4 = new JTextField();
		JTextField field5 = new JTextField();
		JTextField field6 = new JTextField();
		JTextField field7 = new JTextField();
		JTextField field8 = new JTextField();
		JTextField field9 = new JTextField();
		JLabel nombre = new JLabel();
		JLabel universidad = new JLabel();
		nombre.setText("Carlos Alberto Calderon Reyes");
		universidad.setText("Universidad el Bosque");
		Object[] message = {
				"-----------------------------",
				"Características del Emprendimiento",
				"-----------------------------",
				"1.Rentabilidad:", field1,
				"2.TIR:", field2,
				"3.Mercado Potencial:", field3,
				"4.Capital Inicial:", field4,
				"5.Crecimiento:", field5,
				"-----------------------------",
				"Características del Solicitante",
				"-----------------------------",
				"6.Patrimonio:", field6,
				"7.Perfil de riesgo:", field7,
				"8.Ingresos:", field8,
				"9.Gastos", field9,
				"-----------------------------",
				"Desarrollado por:",nombre,
				"",universidad,
				"-----------------------------",
		};


		int option = JOptionPane.showConfirmDialog( null, message, "Ingrese Valores:", JOptionPane.OK_CANCEL_OPTION);
		if (option == JOptionPane.OK_OPTION)
		{
			prestamo.setRentabilidad(Integer.parseInt(field1.getText()));	
			prestamo.setTir(Integer.parseInt(field2.getText()));
			prestamo.setMercado(Integer.parseInt(field3.getText()));
			prestamo.setCapital(Integer.parseInt(field4.getText()));
			prestamo.setCrecimiento(Integer.parseInt(field5.getText()));
			prestamo.setPatrimonio(Integer.parseInt(field6.getText()));
			prestamo.setRiesgo(Integer.parseInt(field7.getText()));
			prestamo.setIngresos(Integer.parseInt(field8.getText()));
			prestamo.setGastos(Integer.parseInt(field9.getText()));

			System.out.println("prestamo desde Dialog: "+prestamo.toString());
			DroolsTest droolsTest = new DroolsTest();
			droolsTest.executeDrools(prestamo);
			
			
		}
		
	}
}
