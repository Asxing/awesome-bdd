# language: zh-CN
@calculate
功能: 进行基本运算

  背景: 基本运算测试

  @add
  场景大纲: 两数相加
    假如 两数相加
    当 参数一"<num1>"加参数二"<num2>"
    那么 两数相加输出的结果是"<num3>"
  @right
    例子:
      | num1 | num2 | num3 |
      | 1    | 2    | 3    |

  @wrong
    例子:
      | num1 | num2 | num3 |
      | 1    | 2    | 4    |

  @subtract
  场景大纲: 两数相减
    假如 两数相减
    当 参数一"<num1>"减参数二"<num2>"
    那么 两数相减输出的结果是"<num3>"
  @right
    例子:
      | num1 | num2 | num3 |
      | 2    | 2    | 0    |

  @wrong
    例子:
      | num1 | num2 | num3 |
      | 3    | 2    | 4    |

  @multiply
  场景大纲: 两数相乘
    假如 两数相乘
    当 参数一"<num1>"乘参数二"<num2>"
    那么 两数相乘输出的结果是"<num3>"
  @right
    例子:
      | num1 | num2 | num3 |
      | 2    | 2    | 4    |

  @wrong
    例子:
      | num1 | num2 | num3 |
      | 3    | 2    | 6    |

  @divide
  场景大纲: 两数相除
    假如 两数相除
    当 参数一"<num1>"除参数二"<num2>"
    那么 两数相除输出的结果是"<num3>"
  @right
    例子:
      | num1 | num2 | num3 |
      | 6    | 2    | 3    |

  @wrong
    例子:
      | num1 | num2 | num3 |
      | 4    | 2    | 2    |
