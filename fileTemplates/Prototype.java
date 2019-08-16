package ${PACKAGE_NAME};

/**
 * 原型模式
 * 
 * Created by qindachang on ${DATE}.
 */

public class ${NAME}Prototype implements Cloneable {
    private String text;
    
    public ${NAME}Prototype() {
    }
    
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    /**
     * 浅拷贝
     */
    @Override
    protected ${NAME}Prototype clone() {
        try {
            ${NAME}Prototype doc = (${NAME}Prototype) super.clone();
            doc.text = this.text;
            return doc;
        } catch (Exception e) {
        }
        return null;
    }
    
    /**
     * 深拷贝
     */
    @Override
    protected ${NAME}Prototype clone() {
        try {
            ${NAME}Prototype doc = (${NAME}Prototype) super.clone();
            doc.text = (String)this.text.clone();
            return doc;
        } catch (Exception e) {
        }
        return null;
    }
}