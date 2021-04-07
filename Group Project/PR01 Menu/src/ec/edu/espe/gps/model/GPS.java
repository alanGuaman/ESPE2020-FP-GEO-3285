package ec.edu.espe.gps.model;

public class GPS {

    /**
     * @return the per3Lat1
     */
    public double getPer3Lat1() {
        return per3Lat1;
    }

    /**
     * @param per3Lat1 the per3Lat1 to set
     */
    public void setPer3Lat1(double per3Lat1) {
        this.per3Lat1 = per3Lat1;
    }

    /**
     * @return the per3Len1
     */
    public double getPer3Len1() {
        return per3Len1;
    }

    /**
     * @param per3Len1 the per3Len1 to set
     */
    public void setPer3Len1(double per3Len1) {
        this.per3Len1 = per3Len1;
    }

    /**
     * @return the per3Lat2
     */
    public double getPer3Lat2() {
        return per3Lat2;
    }

    /**
     * @param per3Lat2 the per3Lat2 to set
     */
    public void setPer3Lat2(double per3Lat2) {
        this.per3Lat2 = per3Lat2;
    }

    /**
     * @return the per3Len2
     */
    public double getPer3Len2() {
        return per3Len2;
    }

    /**
     * @param per3Len2 the per3Len2 to set
     */
    public void setPer3Len2(double per3Len2) {
        this.per3Len2 = per3Len2;
    }

    /**
     * @return the per3Lat3
     */
    public double getPer3Lat3() {
        return per3Lat3;
    }

    /**
     * @param per3Lat3 the per3Lat3 to set
     */
    public void setPer3Lat3(double per3Lat3) {
        this.per3Lat3 = per3Lat3;
    }

    /**
     * @return the per3Len4
     */
    public double getPer3Len4() {
        return per3Len4;
    }

    /**
     * @param per3Len4 the per3Len4 to set
     */
    public void setPer3Len4(double per3Len4) {
        this.per3Len4 = per3Len4;
    }
    
    private double latDegrees;
    private double latMinutes;
    private double latSeconds;
    private double lenDegrees;
    private double lenMinutes;
    private double lenSeconds;
    private double per3Lat1;
    private double per3Len1;
    private double per3Lat2;
    private double per3Len2;
    private double per3Lat3;
    private double per3Len4;
    
    public GPS(double latDegrees, double latMinutes, double latSeconds, double lenDegrees, double lenMinutes, double lenSeconds) {
        this.latDegrees = latDegrees;
        this.latMinutes = latMinutes;
        this.latSeconds = latSeconds;
        this.lenDegrees = lenDegrees;
        this.lenMinutes = lenMinutes;
        this.lenSeconds = lenSeconds;
        
    }

    /**
     * @return the latDegrees
     */
    public double getLatDegrees() {
        return latDegrees;
    }

    /**
     * @param latDegrees the latDegrees to set
     */
    public void setLatDegrees(double latDegrees) {
        this.latDegrees = latDegrees;
    }

    /**
     * @return the latMinutes
     */
    public double getLatMinutes() {
        return latMinutes;
    }

    /**
     * @param latMinutes the latMinutes to set
     */
    public void setLatMinutes(double latMinutes) {
        this.latMinutes = latMinutes;
    }

    /**
     * @return the latSeconds
     */
    public double getLatSeconds() {
        return latSeconds;
    }

    /**
     * @param latSeconds the latSeconds to set
     */
    public void setLatSeconds(double latSeconds) {
        this.latSeconds = latSeconds;
    }

    /**
     * @return the lenDegrees
     */
    public double getLenDegrees() {
        return lenDegrees;
    }

    /**
     * @param lenDegrees the lenDegrees to set
     */
    public void setLenDegrees(double lenDegrees) {
        this.lenDegrees = lenDegrees;
    }

    /**
     * @return the lenMinutes
     */
    public double getLenMinutes() {
        return lenMinutes;
    }

    /**
     * @param lenMinutes the lenMinutes to set
     */
    public void setLenMinutes(double lenMinutes) {
        this.lenMinutes = lenMinutes;
    }

    /**
     * @return the lenSeconds
     */
    public double getLenSeconds() {
        return lenSeconds;
    }

    /**
     * @param lenSeconds the lenSeconds to set
     */
    public void setLenSeconds(double lenSeconds) {
        this.lenSeconds = lenSeconds;
    }

    /**
     * @return the Save
     */
    
}
