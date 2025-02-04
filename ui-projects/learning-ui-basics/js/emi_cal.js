
const loanAmount = document.getElementById("loanAmount");
const interestRate = document.getElementById("interestRate");
const loanTenure = document.getElementById("loanTenure");
const idEmiResult = document.getElementById("idEmiResult");

function showEmiAmount(){
    
        let amount = loanAmount.value;
        let ir = interestRate.value;
        let lt = loanTenure.value;
        let r = ir / 12 / 100;
        let emi = (amount * r * Math.pow(1 + r, lt)) / (Math.pow(1 + r, lt) - 1);
        totalAmount = emi * lt + amount;
        totalInterest = totalAmount - amount;
        let data = `
            <strong>Amount          :</strong> ${amount}<br>
            <strong>Interest Rage   :</strong> ${ir} (%)<br>
            <strong>Loan Tenure     :</strong> ${lt} (Month)<br>
            <strong>Emi             :</strong> ${Math.round(emi)}<br>
            <strong>Total Amount    :</strong> ${Math.round(totalAmount)}<br>
            <strong>Total Interest  :</strong> ${Math.round(totalInterest)}<br>

        `
        idEmiResult.innerHTML = data;
}
function resetForm(){
        loanAmount.value = '';
        interestRate.value = '';
        loanTenure.value = '';
        idEmiResult.innerHTML = '';

}