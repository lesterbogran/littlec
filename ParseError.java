
public enum ParseError {
SYNTAX, UNBAL_PARENS, NO_EXP, EQUALS_EXPECTED,
     NOT_VAR, PARAM_ERR,PARAM_NOT_EQUAL, SEMI_EXPECTED,
     UNBAL_BRACES, FUNC_UNDEF, TYPE_EXPECTED,
     NEST_FUNC, RET_NOCALL, PAREN_EXPECTED,
     WHILE_EXPECTED, QUOTE_EXPECTED, NOT_TEMP,
     TOO_MANY_LVARS, DIV_BY_ZERO;

	@Override
	public String toString() {
		switch(this) { 
			case SYNTAX: return "syntax error";
			case UNBAL_PARENS: return "()û��ƥ��";
			case NO_EXP: return "û�б��ʽ";
			case NOT_VAR: return "���Ǳ���";
			case PARAM_ERR: return "��������";
			case PARAM_NOT_EQUAL: return "�βκ�ʵ�θ�����ƥ��";
			case SEMI_EXPECTED: return "ȱ��;��";
			case UNBAL_BRACES: return "{}û��ƥ��";
			case FUNC_UNDEF: return "����δ����";
			case TYPE_EXPECTED: return "syntax error";
			case NEST_FUNC: return "syntax error";
		}
		return super.toString();
	}

	void error(){
		throw new RuntimeException(toString());
	}
     
     
}
