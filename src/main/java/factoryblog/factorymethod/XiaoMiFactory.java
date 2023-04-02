package factoryblog.factorymethod;

import factoryblog.simplefactory.MiPhone;
import factoryblog.simplefactory.Phone;

public class XiaoMiFactory implements AbstractFactory{
    @Override
    public Phone makePhone() {
        return new MiPhone();
    }
}
