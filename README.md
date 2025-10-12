

#Overloading (تعدد الدوال):

هو وجود أكثر من دالة بنفس الاسم داخل نفس الكلاس، لكن تختلف في عدد أو نوع المعاملات.
يُستخدم لتوفير أكثر من طريقة لتنفيذ نفس الوظيفة.

#المثال في الكود:

public double distance(SimpleLocation other) { ... }
public double distance(double lat, double lon) { ... }

هذا يمثل Overloading لأن الدالتين لهما نفس الاسم distance ولكن معاملات مختلفة.


#Overriding (إعادة التعريف):

هو إعادة تعريف دالة موروثة من كلاس الأب لتؤدي وظيفة جديدة تناسب الكلاس الحالي.
يُستخدم لتغيير سلوك الدالة الأصلية.

#المثال في الكود:

@Override
public String toString() {
    return "SimpleLocation{" + "latitude=" + latitude + ", longitude=" + longitude + '}';
}

هذا يمثل Overriding لأننا أعدنا تعريف toString() من الكلاس الأب Object.


# الفرق بين Overloading و Overriding:

في Overloading: الدوال تكون داخل نفس الكلاس، وتختلف في عدد أو نوع المعاملات.

في Overriding: الدالة تكون في كلاس الابن، وتكون بنفس الاسم والمعاملات لكن تُغيّر السلوك.

هدف Overloading هو تنويع طرق تنفيذ نفس الفكرة.

هدف Overriding هو تعديل سلوك دالة موروثة لتناسب الكلاس الحالي.
