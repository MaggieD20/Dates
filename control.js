
let btn_j = document.querySelector(".j");
let btn_m = document.querySelector(".m");
let btn_a = document.querySelector(".a");
let btn_jm = document.querySelector(".j_m");
let btn_ma = document.querySelector(".m_a");
let btn_jma = document.querySelector(".j_m_a");

let main = document.querySelector(".main");
btn_j.addEventListener("click", function () { reinitialiser(); calculerJour(31); });
btn_m.addEventListener("click", function () { reinitialiser(); calculerMois(); });
btn_a.addEventListener("click", function () { reinitialiser(); calculerAnnee(0, 3000); });
btn_ma.addEventListener("click", function () { reinitialiser(); calculerAnnee(0, 3000); calculerMois(); });
btn_jm.addEventListener("click", function () { reinitialiser(); calculerMois(); calculerJour(max) });
btn_jma.addEventListener("click", function () { reinitialiser(); calculerAnnee(0, 3000); calculerMois(); calculerJour(max); });


let reponse = document.createElement("div");
let max;
let annee;


function calculerJour(maxJ) {
    let titre = document.createElement("h3");
    titre.innerText = Math.floor(Math.random() * maxJ) + 1;
    reponse.prepend(titre);
}

function calculerMois() {
    let titre = document.createElement("h3");
    mois = Math.floor(Math.random() * 12) + 1;

    if (mois == 1) {
        max = 31;
        titre.innerText = "janvier";
    } else if (mois == 2) {
        if (annee % 4 != 0 || (année % 400 != 0)) {
            max = 29;
        } else {
            max = 28;
        }
        titre.innerText = "février";
    } else if (mois == 3) {
        max = 31;
        titre.innerText = "mars";
    } else if (mois == 4) {
        max = 30;
        titre.innerText = "avril";
    } else if (mois == 5) {
        titre.innerText = "mai";
        max = 31;
    } else if (mois == 6) {
        max = 30;
        titre.innerText = "juin";
    } else if (mois == 7) {
        max = 31;
        titre.innerText = "juillet";
    } else if (mois == 8) {
        max = 31;
        titre.innerText = "août";
    } else if (mois == 9) {
        max = 30;
        titre.innerText = "septembre";
    } else if (mois == 10) {
        max = 31;
        titre.innerText = "octobre";
    } else if (mois == 11) {
        max = 30;
        titre.innerText = "novembre";
    } else if (mois == 12) {
        max = 31;
        titre.innerText = "décembre";
    }
    reponse.prepend(titre);

}

function calculerAnnee(min, max) {
    annee = Math.floor(Math.random() * (max - min)) + min;
    let titre = document.createElement("h3");
    titre.innerText = annee;
    reponse.append(titre);
}

function reinitialiser() {
    reponse.remove();
    max = 0;
    annee = 0;
    reponse = document.createElement("div");

    reponse.classList.add("reponse");
    main.append(reponse);
}