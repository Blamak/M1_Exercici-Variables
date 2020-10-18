const nom           = "Víctor Lasheras Sánchez";
const dataNaixement = "15/07/1974";
const anyNaixement  = dataNaixement.slice(-4);

console.log(`El meu nom és ${nom}.`);
console.log(`Vaig néixer el ${dataNaixement}.`);

bixestSi = `El meu any de naixement és any de traspàs`;
bixestNo = `El meu any de naixement no és any de traspàs`;

esAnyTraspas = (anyNaixement % 4 == 0 && anyNaixement % 100 != 0) || anyNaixement % 400 == 0;
if (esAnyTraspas) {
    console.log(bixestSi);
} else {
    console.log(bixestNo);
}
