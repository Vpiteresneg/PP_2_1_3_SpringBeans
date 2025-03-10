package app.model;
//1) Создайте бин Dog, унаследуйте его от Animal. Создайте на основе этого класса компонент.
//2) Запустите приложение и проверьте, что было выброшено исключение NoUniqueBeanDefinitionException. Это произошло из-за того, что существует 2 бина с типом Animal.
//3) Прочитайте о связывании бинов по имени и свяжите AnimalCage c бином Dog через абстрактный класс Animal.
//4) На основе класса Timer создайте бин. Свяжите с AnimalCage. Проверьте, что при выполнении метода main время, которое пишет таймер, одно и тоже.
import org.springframework.stereotype.Component;

@Component ("dog") //Указываем, что это бин Spring
public class Dog extends Animal {
    @Override
    public String toString() {

        return "Im a Dog";
    }


}
