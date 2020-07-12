package homework.homework8.СontractActConversion;

public class Conversion {
    static public Contract mapActToContract(Act act) {
        return new Contract(act.getNumber(), act.getDate(), act.getGoodsList().clone());
    }

    static public Act mapContractToAct(Contract contract) {
        return new Act(contract.getNumber(), contract.getDate(), contract.getGoodsList().clone());
    }
}
