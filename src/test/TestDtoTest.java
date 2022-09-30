package test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class TestDtoTest {
    public static void main(String[] args) {
        TestDto testDto = new TestDto("123", "45");
        TestDto testDto2 = new TestDto("123", "test1");
        TestDto testDto3 = new TestDto("", "test1, test2, test3, test4");
        String sql1 = assembleSqlFromObj(testDto);
        String sql2 = assembleSqlFromObj(testDto2);
        String sql3 = assembleSqlFromObj(testDto3);
        System.out.println(sql1);
        System.out.println(sql2);
        System.out.println(sql3);
    }

    private static String assembleSqlFromObj(Object obj) {
        Table table = obj.getClass().getAnnotation(Table.class);
        StringBuffer sbSql = new StringBuffer();
        String tableName = table.value();
        sbSql.append("select * from "+tableName+" where ");
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field f : fields){
            String fieldName = f.getName();
            String methodName = "get"+fieldName.substring(0,1).toUpperCase() + fieldName.substring(1);
        }

    }

}