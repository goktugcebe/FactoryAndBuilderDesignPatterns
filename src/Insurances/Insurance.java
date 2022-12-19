package Insurances;

public class Insurance {
    private int standardPacket;
    private int addExtraPacket;
    private int addDeluxePacket;
    private int addPremiumPacket;

    public int getStandardPacket() {
        return standardPacket;
    }

    public int getAddExtraPacket() {
        return addExtraPacket;
    }

    public int getAddDeluxePacket() {
        return addDeluxePacket;
    }

    public int getAddPremiumPacket() {
        return addPremiumPacket;
    }

    public Insurance(InsuranceBuilder builder) {
        this.standardPacket = builder.standardPacket;
        this.addExtraPacket = builder.addExtraPacket;
        this.addDeluxePacket = builder.addDeluxePacket;
        this.addPremiumPacket = builder.addPremiumPacket;
    }

    public static class InsuranceBuilder{
        private int standardPacket;
        private int addExtraPacket;
        private int addDeluxePacket;
        private int addPremiumPacket;

        public InsuranceBuilder(){}

        public InsuranceBuilder setStandardPacket(int standardPacket){
            this.standardPacket=standardPacket;
            return this;
        }
        public InsuranceBuilder setExtraPacket(int addExtraPacket){
            this.addExtraPacket=addExtraPacket;
            return this;
        }
        public InsuranceBuilder setDeluxePacket(int addDeluxePacket){
            this.addDeluxePacket=addDeluxePacket;
            return this;
        }
        public InsuranceBuilder setPremiumPacket(int addPremiumPacket){
            this.addPremiumPacket=addPremiumPacket;
            return this;
        }
        public Insurance Build(){
            return new Insurance(this);
        }
    }
}