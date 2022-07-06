
public enum ErrorCode {

	VALIDATION(1),
	FILEDNOTFOUND(2);

	private Integer code;
	
	ErrorCode(Integer code){
		
	}

	public void setCode(Integer code) {
		this.code = code;
	}
	public Integer getCode() {
		return code;
	}
	
	public static ErrorCode fromcode(Integer code) {
        for (ErrorCode ErroCode : ErrorCode.values()) {
            if (ErroCode.getCode().equals(code)) {
                return ErroCode;
            }
        }

        return null;
    }
}
