package ${PACKAGE_NAME};

/**
 * Created by qindachang on ${DATE}.
 */
 
public class ${NAME} {

    private int age;

    private ${NAME}(Builder builder) {
        age = builder.age;
    }
    
    public int getAge() {
        return age;
    }

    public static class Builder {
        private int age;
        
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        
        public ${NAME} build() {
            return new ${NAME}(this);
        }
    }
}
