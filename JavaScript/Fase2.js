const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Introdueix el teu any de naixement: ', anyNaixement => {
    const ANY_INICIAL  = 1948;
    const interval     = 4;
    
    const totalAnysTraspas = Math.floor((anyNaixement - ANY_INICIAL) / interval) + 1;
    
    console.log(`Anys de traspàs entre 1948 i ${anyNaixement}: ${totalAnysTraspas}`);
    rl.close();
  });

