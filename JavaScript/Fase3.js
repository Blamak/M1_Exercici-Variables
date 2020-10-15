const anyInici     = 1948;
const interval     = 4;
const anyNaixement = 1974;

for (let i = anyInici; i <= anyNaixement; i+=4 ) {
    console.log(i);
}

bixestSi = `L'any ${anyNaixement} és any de traspàs`;
bixestNo = `L'any ${anyNaixement} no és any de traspàs`;

esAnyTraspas = (anyNaixement % 4 == 0 || anyNaixement % 400 == 0) && !(anyNaixement % 100 == 0);
if (esAnyTraspas) {
    console.log(bixestSi);
} else {
    console.log(bixestNo);
}