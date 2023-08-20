public class GenerationString {
    String a1 = "Товарищи!";
    String a2 = "С другой стороны";
    String a3 = "Равным образом";
    String a4 = "Не следует, однако, забывать что";
    String a5 = "Таким образом";
    String a6 = "Повседневная практика показывает, что";
    String b1 = "реализация намеченных плановых заданий";
    String b2 = "рамки и место обучения кадров";
    String b3 = "постоянный количественный рост и сфера нашей активности";
    String b4 = "сложившаяся структура организации";
    String b5 = "новая модель организационной деятельности";
    String b6 = "дальнейшее развитие различных форм деятельности";
    String c1 = "играет важную роль в формировании";
    String c2 = "требуют от нас анализа";
    String c3 = "требуют определения и уточнения";
    String c4 = "способствует подготовке и реализации";
    String c5 = "обеспечивает широкому кругу (специалистов) участие в формировании";
    String c6 = "позволяет выполнить важные задания по разработке";
    String d1 = "существенных финансовых и административных условий";
    String d2 = "дальнейших направлений развития";
    String d3 = "системы массового участия";
    String d4 = "позиций, занимаемых участниками в отношении поставленных задач";
    String d5 = "новых предложений";
    String d6 = "направлений прогрессивного развития";

    public void getString(int a, int b, int c, int d) {
        String str = "";
        switch (a) {
            case 1:
                str += a1;
                break;
        
            case 2:
                str += a2;
                break;
        
            case 3:
                str += a3;
                break;
        
            case 4:
                str += a4;
                break;
        
            case 5:
                str += a5;
                break;
        
            case 6:
                str += a6;
                break;
        
            default:
                System.out.println("Параметр выходит за границы!");
                break;
        }
        str += " ";
        switch (b) {
            case 1:
                str += b1;
                break;
        
            case 2:
                str += b2;
                break;
        
            case 3:
                str += b3;
                break;
        
            case 4:
                str += b4;
                break;
        
            case 5:
                str += b5;
                break;
        
            case 6:
                str += b6;
                break;
        
            default:
                System.out.println("Параметр выходит за границы!");
                break;
        }
        str += " ";
        switch (c) {
            case 1:
                str += c1;
                break;
        
            case 2:
                str += c2;
                break;
        
            case 3:
                str += c3;
                break;
        
            case 4:
                str += c4;
                break;
        
            case 5:
                str += c5;
                break;
        
            case 6:
                str += c6;
                break;
        
            default:
                System.out.println("Параметр выходит за границы!");
                break;
        }
        str += " ";
        switch (d) {
            case 1:
                str += d1;
                break;
        
            case 2:
                str += d2;
                break;
        
            case 3:
                str += d3;
                break;
        
            case 4:
                str += d4;
                break;
        
            case 5:
                str += d5;
                break;
        
            case 6:
                str += d6;
                break;
        
            default:
                System.out.println("Параметр выходит за границы!");
                break;
        }
        System.out.println(str);
    }

    public void getStringArr(int a, int b, int c, int d) {
        String[] strA = {a1, a2, a3, a4, a5, a6};
        String[] strB = {b1, b2, b3, b4, b5, b6};
        String[] strC = {c1, c2, c3, c4, c5, c6};
        String[] strD = {d1, d2, d3, d4, d5, d6};
        String str = strA[a] + " " + strB[b] + " " + strC[c] + " " + strD[d];
        System.out.println(str); 
    }


    }
