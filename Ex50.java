package loops;

import javax.swing.JOptionPane;

public class Ex50 {

	public static void main(String[] args) {

		Double cityA, cityB, distance = 0.0, timeUntilMeet = 0.0;

		String userAnswer;

		do {

			cityA = Double.parseDouble(JOptionPane.showInputDialog(null, "Input City A (km): "));

			cityB = Double.parseDouble(JOptionPane.showInputDialog(null, "Input City B (km): "));

			if (cityA <= 0 || cityB <= 0) {

				JOptionPane.showMessageDialog(null, "Please input a positive value or greater than zero");

			} else if (cityA == cityB) {

				JOptionPane.showMessageDialog(null, "Please input different values for the cities");

			} else {

				if (cityA > cityB) {

					distance = cityA - cityB;

				} else {

					distance = cityB - cityA;
				}

				JOptionPane.showMessageDialog(null, "The distance between cities is " + distance + " km.");

				double speedTrain1 = 80;

				double speedTrain2 = 100;

				double relativeSpeed = speedTrain1 + speedTrain2;

				timeUntilMeet = distance / relativeSpeed;

				timeUntilMeet *= 60;

				JOptionPane.showMessageDialog(null,
						"It will take approximately " + Math.round(timeUntilMeet) + " minutes until both trains meet.");
			}

			userAnswer = JOptionPane.showInputDialog(null, "Do you want to continue? (yes/no)").trim();

		} while (userAnswer.equalsIgnoreCase("yes"));

		JOptionPane.showMessageDialog(null, "Program finished.");
	}
}
