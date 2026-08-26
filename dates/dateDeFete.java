// import java.util.Random;
// import java.util.Scanner;

// public class dateDeFete {

// public static void main(String[] args) {
// // TODO Auto-generated method stub
// int mois;
// int jour;
// int année;
// int saisie;
// int max;
// int min;

// Scanner sc = new Scanner(System.in);
// Random rnd = new Random();

// do {
// System.out.println("\nEntrez le chiffre pour l'action que vous voulez
// exécuter "
// + "(1) une journée, "
// + "(2) un mois, "
// + "(3) une année, "
// + "(4) une journée et un mois, "
// + "(5) une journée, un mois et une année,"
// + " cliquez sur (6) pour quitter.");
// System.out.print("1-6): ");

// saisie = sc.nextInt();

// switch (saisie) {
// case 1:
// jour = rnd.nextInt(31) + 1;
// System.out.println(jour);
// break;
// case 2:
// mois = rnd.nextInt(12) + 1;

// break;
// case 3:
// System.out.println("entrez l'année maximale que vous voulez");
// max = sc.nextInt();
// System.out.println("entrez l'année minimale que vous voulez");
// min = sc.nextInt();
// année = rnd.nextInt(max - min) + min;
// System.out.println(année);
// break;
// case 4:
// mois = rnd.nextInt(12) + 1;

// if (mois == 1) {
// jour = rnd.nextInt(31) + 1;
// System.out.print(jour);
// System.out.println(" janvier");
// } else if (mois == 2) {
// jour = rnd.nextInt(29) + 1;
// System.out.print(jour);
// System.out.println(" février");
// } else if (mois == 3) {
// jour = rnd.nextInt(31) + 1;
// System.out.print(jour);
// System.out.println(" mars");
// } else if (mois == 4) {
// jour = rnd.nextInt(30) + 1;
// System.out.print(jour);
// System.out.println(" avril");
// } else if (mois == 5) {
// jour = rnd.nextInt(31) + 1;
// System.out.print(jour);
// System.out.println(" mai");
// } else if (mois == 6) {
// jour = rnd.nextInt(30) + 1;
// System.out.print(jour);
// System.out.println(" juin");
// } else if (mois == 7) {
// jour = rnd.nextInt(31) + 1;
// System.out.print(jour);
// System.out.println(" juillet");
// } else if (mois == 8) {
// jour = rnd.nextInt(31) + 1;
// System.out.print(jour);
// System.out.println(" août");
// } else if (mois == 9) {
// jour = rnd.nextInt(30) + 1;
// System.out.print(jour);
// System.out.println(" septembre");
// } else if (mois == 10) {
// jour = rnd.nextInt(31) + 1;
// System.out.print(jour);
// System.out.println(" octobre");
// } else if (mois == 11) {
// jour = rnd.nextInt(30) + 1;
// System.out.print(jour);
// System.out.println(" novembre");
// } else if (mois == 12) {
// jour = rnd.nextInt(31) + 1;
// System.out.print(jour);
// System.out.println(" décembre");
// }

// break;

// case 5:
// System.out.println("entrez l'année maximale que vous voulez");
// max = sc.nextInt();
// System.out.println("entrez l'année minimale que vous voulez");
// min = sc.nextInt();
// année = rnd.nextInt(max - min) + min;
// mois = rnd.nextInt(12) + 1;
// if (mois == 1) {
// jour = rnd.nextInt(31) + 1;
// System.out.print(jour);
// System.out.print(" janvier ");
// } else if ((mois == 2) && (année % 4 == 0) || (année % 400 == 0)) {
// jour = rnd.nextInt(29) + 1;
// System.out.print(jour);
// System.out.print(" février ");
// } else if ((mois == 2) && ((année % 4 != 0) || (année % 400 != 0))) {
// jour = rnd.nextInt(28) + 1;
// System.out.print(jour);
// System.out.print(" février ");
// } else if (mois == 3) {
// jour = rnd.nextInt(31) + 1;
// System.out.print(jour);
// System.out.print(" mars ");
// } else if (mois == 4) {
// jour = rnd.nextInt(30) + 1;
// System.out.print(jour);
// System.out.print(" avril ");
// } else if (mois == 5) {
// jour = rnd.nextInt(31) + 1;
// System.out.print(jour);
// System.out.print(" mai ");
// } else if (mois == 6) {
// jour = rnd.nextInt(30) + 1;
// System.out.print(jour);
// System.out.print(" juin ");
// } else if (mois == 7) {
// jour = rnd.nextInt(31) + 1;
// System.out.print(jour);
// System.out.print(" juillet ");
// } else if (mois == 8) {
// jour = rnd.nextInt(31) + 1;
// System.out.print(jour);
// System.out.print(" août ");
// } else if (mois == 9) {
// jour = rnd.nextInt(30) + 1;
// System.out.print(jour);
// System.out.print(" septembre ");
// } else if (mois == 10) {
// jour = rnd.nextInt(31) + 1;
// System.out.print(jour);
// System.out.print(" octobre ");
// } else if (mois == 11) {
// jour = rnd.nextInt(30) + 1;
// System.out.print(jour);
// System.out.print(" novembre ");
// } else if (mois == 12) {
// jour = rnd.nextInt(31) + 1;
// System.out.print(jour);
// System.out.print(" décembre ");
// }
// System.out.println(année);
// break;
// }
// } while (saisie != 6);
// System.out.print("Au revoir");
// }
// }