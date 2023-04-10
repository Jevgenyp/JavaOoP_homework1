package org.homework4;

import java.util.ArrayList;
import java.util.List;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Calculator {
    public double sum(List<? extends Number> list) {
        double result = 0.0;
        for (Number n: list) {
            result += n.doubleValue();
        }
        return result;
    }

    public double multiply(List<? extends Number> list) {
        double result = 1.0;
        for (Number n: list) {
            result *= n.doubleValue();
        }
        return result;
    }

    public double division(List<? extends Number> list) {
        double result = list.get(0).doubleValue();
        for (int i = 1; i < list.size(); i++) {
            result = result / list.get(i).doubleValue();
        }
        return result;
    }

    public List<String> toBinary(List<?> list) {
        List<String> result = new ArrayList<>();
        for (Object num : list) {
            int count = 0;
            if (Double.parseDouble(num.toString()) % 1 != 0) {
                StringBuilder sb = new StringBuilder("");
                sb.append(num + " => ");
                double remain = (Double.parseDouble(num.toString()) - Math.floor((Double.parseDouble(num.toString()))));
                int integerPart = (int) (Double.parseDouble(num.toString()));
                sb.append(Integer.toBinaryString(integerPart));
                sb.append(".");
                while (remain >= 0) {
                    if (count == 11) {
                        break;
                    } else {
                        remain *= 2;
                        if (remain % 1 == 0) {
                            sb.append((int) remain);
                            break;
                        } else {
                            sb.append((int) remain);
                            remain -= Math.floor(remain);
                            count++;
                        }
                    }
                }
                result.add(sb.toString());
            } else {
                StringBuilder sb = new StringBuilder("");
                sb.append(num + " => ");
                int integerPart = (int) (Double.parseDouble(num.toString()));
                sb.append(Integer.toBinaryString(integerPart));
                result.add(sb.toString());
            }
        }
        return result;
    }

}