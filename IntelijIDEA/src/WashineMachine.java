public class WashineMachine {
    private double ipsos, mikos, vathos, KatanalosiEnergias;
    private String OnomaKataskevasti, OnomaSiskevis, TiposSiskevis;

    private double SinolikiHoritikotita, KatanalosiNerou;
    private boolean PsifiakiOthoni, WiFi;
    private int ArithmosProgrammaton;
    /*dehete to i san timi*/
    public WashineMachine(int i){
    }
    /*dehete times gia oles tis metavlites tis klasis*/
    public WashineMachine(double ipsos, double mikos, double vathos, double KatanalosiEnergias, String onomaKataskevasti, String onomaSiskevis, String tiposSiskevis, double sinolikiHoritikotita, double katanalosiNerou, boolean psifiakiOthoni, boolean wiFi, int arithmosProgrammaton) {
        this.ipsos = ipsos;
        this.mikos = mikos;
        this.vathos = vathos;
        this.OnomaKataskevasti = onomaKataskevasti;
        this.OnomaSiskevis = onomaSiskevis;
        this.TiposSiskevis = tiposSiskevis;
        this.KatanalosiEnergias = KatanalosiEnergias;
        this.SinolikiHoritikotita = sinolikiHoritikotita;
        this.KatanalosiNerou = katanalosiNerou;
        this.PsifiakiOthoni = psifiakiOthoni;
        this.WiFi = wiFi;
        this.ArithmosProgrammaton = arithmosProgrammaton;
    }
    /*dini times stis metavlites tis klasis*/
    public WashineMachine(double ipsos, double mikos){
        this.ipsos = 84.8;
        this.mikos = 59.9;
        this.vathos = 55;
        this.OnomaKataskevasti = "BOSCH";
        this.OnomaSiskevis = "WLN2010GR54I";
        this.TiposSiskevis = "Washine Machine";
        this.KatanalosiEnergias = 135;
    }
    /*dini times stis metavlites tis klasis*/
    public WashineMachine(){
        this.SinolikiHoritikotita = 10;
        this.KatanalosiNerou = 12499;
        this.PsifiakiOthoni = true;
        this.WiFi = false;
        this.ArithmosProgrammaton = 10;
    }

    private static int ArithmosAntikimenon = 0;{

        ArithmosAntikimenon = ArithmosAntikimenon+1;
    }
    public static int getAritmosAntikimenon(){

        return ArithmosAntikimenon;
    }

    public double getIpsos() {
        return ipsos;
    }

    public void setIpsos(double ipsos) {
        this.ipsos = ipsos;
    }

    public double getMikos() {
        return mikos;
    }

    public void setMikos(double mikos) {
        this.mikos = mikos;
    }

    public double getVathos() {
        return vathos;
    }

    public void setVathos(double vathos) {
        this.vathos = vathos;
    }

    public String getOnomaKataskevasti() {
        return OnomaKataskevasti;
    }

    public void setOnomaKataskevasti(String onomaKataskevasti) {
        OnomaKataskevasti = onomaKataskevasti;
    }

    public String getOnomaSiskevis() {
        return OnomaSiskevis;
    }

    public void setOnomaSiskevis(String onomaSiskevis) {
        OnomaSiskevis = onomaSiskevis;
    }

    public String getTiposSiskevis() {
        return TiposSiskevis;
    }

    public void setTiposSiskevis(String tiposSiskevis) {
        TiposSiskevis = tiposSiskevis;
    }

    public double getKatanalosiEnergias() { return KatanalosiEnergias; }

    public void setKatanalosiEnergias(double katanalosiEnergias) {
        KatanalosiEnergias = KatanalosiEnergias;
    }

    public double getSinolikiHoritikotita() {
        return SinolikiHoritikotita;
    }

    public void setSinolikiHoritikotita(double sinolikiHoritikotita) {
        SinolikiHoritikotita = sinolikiHoritikotita;
    }

    public double getKatanalosiNerou() {
        return KatanalosiNerou;
    }

    public void setKatanalosiNerou(double katanalosiNerou) {
        KatanalosiNerou = katanalosiNerou;
    }

    public boolean isPsifiakiOthoni() {
        return PsifiakiOthoni;
    }

    public void setPsifiakiOthoni(boolean psifiakiOthoni) {
        PsifiakiOthoni = psifiakiOthoni;
    }

    public boolean isWiFi() {
        return WiFi;
    }

    public void setWiFi(boolean wiFi) {
        WiFi = wiFi;
    }

    public int getArithmosProgrammaton() {
        return ArithmosProgrammaton;
    }

    public void setArithmosProgrammaton(int arithmosProgrammaton) {
        ArithmosProgrammaton = arithmosProgrammaton;
    }
    /* den kanei tipota (etsi zitithike apo tin askisi)
     */
    public void periodicMantainance(){
    }
    /*tiponi tis times ton vasikon metavliton tis klasis
    se katalila diamorfomeno kimeno
    */
    public void VasikaHaraktiristika(){
        System.out.println("To ipsos einai:"+ipsos+"cm");
        System.out.println("To mikos einai:"+mikos+"cm");
        System.out.println("To vathos einai:"+vathos+"cm");
        System.out.println("To onoma tou kataskevasti einai:"+OnomaKataskevasti);
        System.out.println("To onoma tis siskevis einai:"+OnomaSiskevis);
        System.out.println("O tipos tis siskevis einai:"+TiposSiskevis);
        System.out.println("H katanalosi energias einai:"+ KatanalosiEnergias+"kWh/y");
    }
    /*tiponi tis times ton idikon haraktiristikon tis klasis
   se katalila diamorfomeno kimeno
    */
    public void IdikaHaraktiristika(){
        System.out.println("H sinoliki horitikotita einai:" +SinolikiHoritikotita+"kg");
        System.out.println("I katanalosi nerou einai:"+KatanalosiNerou+"lt/year");
        System.out.println("Psifiaki othoni:"+PsifiakiOthoni);
        System.out.println("WiFi:"+ WiFi);
        System.out.println("Arithmos programmaton:"+ ArithmosProgrammaton);

    }
}
