
生成验证码
原理： Java生成一个图片，图片上的内容有 数字、字母、干扰线

实现逻辑：
    1. 生成一个图片
    2. 准备画笔，画一个矩形覆盖照片，计划在矩形上画数据
    3. 准备数据，随机从数组中取出4个
    4. 通过画笔将数据画到图片上
    5. 生成最后的图片

static String[] strs = {"a","b","c","d","e","f","g","h","i","g","k",
                        "m","n","p","q","r","s","t","u","v","w","x",
                        "y","z","2","3","4","5","6","7","8","9"};

