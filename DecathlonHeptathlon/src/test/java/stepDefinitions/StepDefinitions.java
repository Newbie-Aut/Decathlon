package stepDefinitions;

import java.util.Scanner;

import static org.junit.Assert.*;

import java.lang.Math.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	private String compName;
	private int runningTime;
	private int result;
	private double finalResult;
	private double A = 25.4347;
	private double B = 18;
	private double C = 1.81;

	Scanner sc = new Scanner(System.in);

	@Given("I want to add a name1")
	public void addingCompetitor() {

		// System.out.println("Male or female competitor?");

		System.out.println("Please enter the competitor's name:");
		compName = sc.nextLine();
	}

	@When("I check the time in step")
	public void checkResult() {
		System.out.println("Please enter the result of the 100m run:");
		runningTime = sc.nextInt();

		result = (int) (A * Math.pow((B - runningTime), C));

		System.out.println(compName + "'s score is: " + result);

	}

	@Then("I verify the success in step")
	public void verifyScore() {

	}
}
