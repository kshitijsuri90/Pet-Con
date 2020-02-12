package com.example.kshitij.patentlite;

public class FootPrintAlgorithm {

    private int distance;
    private String modeOfTransport;

    public FootPrintAlgorithm(int distance, String modeOfTransport) {
        this.distance = distance;
        this.modeOfTransport = modeOfTransport;
    }

    public int calculateFootPrint() {
        double emissionPerKm = 0;
        switch (modeOfTransport) {
            case "Walk/Bicycle":
                emissionPerKm = 0;
                break;
            case "Bus":
                emissionPerKm = 0.0151;
                break;
            case "Train":
                emissionPerKm = 0.007965;
                break;
            case "Airplane":
                emissionPerKm = 1.5;
                break;
            case "Autorickshaws":
                emissionPerKm = 0.117;
                break;
            case "Car":
                emissionPerKm = 0.1491;
                break;
            case "Bike":
                emissionPerKm = 0.0385;
                break;
            default:
                break;
        }
        return (int) (emissionPerKm * distance);
    }

    public int setScore(int score) {
        switch (modeOfTransport) {
            case "Walk/Bicycle":
                score += 100;
                break;
            case "Bus":
                score += 100;
                break;
            case "Train":
                score += 100;
                break;
            case "Airplane":
                score -= 200;
                break;
            case "Autorickshaws":
                break;
            case "Car":
                score -= 100;
                break;
            case "Bike":
                score-=100;
                break;
            default:
                break;
        }
        return score;
    }
}
