public class BonusMilesService {
    public int calculate(int price) {
        int milesPerRubles = 20; // количество рублей для одной бонусной мили
        int miles = price / milesPerRubles; // целочисленное деление для округления до целого числа
        return miles;
    }
}
