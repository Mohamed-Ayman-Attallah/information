package com.example.yourinformation;


import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class HomeFragment extends Fragment implements RecycleViewOnItem {
    private RecyclerView recyclerView;
    private MyAdabter myAdabter;
    private ArrayList<adabter> adabters;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.RV_Home);
        myAdabter = new MyAdabter(this, getContext(), adabters);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(myAdabter);


        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adabters = new ArrayList<>();

        adabters.add(new adabter("معلومات عن الكمبيوتر ومجالات البرمجة","ما هي البرمجة؟\n" +
                "البرمجة هي أقوى مجالات الحاسب الآلي و هي لغة التخاطب بين الإنسان ” أنت ” و الآلة مثلها مثل اللغة العربية أو أي لغة أجنبية أخري.\n" +
                "\n" +
                "هي عبارة عن مجموعة من الأوامر التي توجه للحاسب لغرض ما سواء للتعامل مع البيانات أو كيفية تنفيد سلسلة من الأعمال المطلوبة و التي تسمى الخوارزميات.\n" +
                "\n" +
                "\n" +                " \n" +
                "و تتم هذه العملية باللغة البرمجية التي يختارها المبرمج ( الشخص الذي يكتب الأوامر ) فلكل لغة برمجية خصائص تميزها عن الأخرى .\n" +
                "\n" +
                "يجب أن نأخد بعين الإعتبار المهمة المطلوبة لكي نستخدم اللغة البرمجية الصحيحة لبناء أو تنفيذ هذه المهمة. مجالات البرمجة\n" +
                "مجال الويب: وينقسم إلي: تصميم الويب وبرمجة الويب.\n" +
                "مجال تطبيقات الهاتف.\n" +
                "مجال أنظمة التشغيل.\n" +
                "مجال برامج وتطبيقات الحاسب الآلي: “سطح المكتب”.\n" +
                "مجال الألعاب.\n" +
                "مجال إدارة وبرمجة قواعد البيانات.\n" +
                "مجال برمجة الروبوتات.\n" +
                "مجال برمجة الآلات الإلكترونية ( داخل في مجال الروبوتات ).\n" +
                "والآن سنتعرف علي أهم لغات البرمجة المستخدمة في هذه المجالات قبل أن نشرح كل مجال منها وكيفية العمل به والوظائف التي يوفرها.لغات البرمجة وخصائصهالغات البرمجة\n" +
                "لغة البرمجة في الأساس هي الوسيلة التي تمكن المبرمج من كتابة برنامجه في هيئة تعليمات وأوامر يفهمها الحاسب بغرض تنفيذ العمل المطلوب.\n" +
                "\n" +
                "من المعروف ان الحاسب يحول اللغة المكتوب بها البرنامج إلى سلسلة من رقمين هما: 0 و 1، ويبدأ على أساسها عمله. ولكتابة الأوامر، توفر لغة البرمجة المختارة مجموعة من الأمور الأساسية للاستناد إليها أثناء عملية تكوين البرنامج ومجموعة من القواعد التي تمكن من التعامل مع معلومات وتنظيمها بغرض أداء العمل المطلوب.\n" +
                "\n" +
                "تتمثل هذه الأسس والقواعد بصفة عامة في:\n" +
                "\n" +
                "المعلومات وتخزينها\n" +
                "الأوامر وتنظيم سيرها\n" +
                "التصميم الخاص\n" +
                "كود مصدري لبرنامج حاسوبي بسيط مكتوب بلغة البرمجة سي، والتي ستخرج رسالة «أهلا بالعالم» عند التجميع والتشغيل.\n" +
                "\n" +
                "الصورة السابقة هي عبارة عن كود مصدري لبرنامج بسيط مكتوب بلغة C، والتي ستخرج رسالة «أهلا بالعالم» عند تجميع وتشغيل البرنامج.\n" +
                "\n" +
                "تنقسم لغات البرمجة بناء على قربها من اللغات الإنسانية إلى:\n" +
                "\n" +
                "لغات عالية المستوى (قريبة من اللغة التي يفهمها البشر) مثل سي وجافا.\n" +
                "لغات منخفضة المستوى (كلغة التجميع؛ وهي قريبة من لغة الآلة).\n" +
                "وتقسم أحياناً بناء على الأغراض المرغوبة من اللغة المستخدمة.\n" +
                "\n" +
                "لغات صُممت لكي تعمل على أجهزة معينة، مثل أن تقوم شركة ما بإنتاج جهاز حاسب أو معالج مركزي (وحدة معالجة مركزية)، وتوفر له دليل استعمال يحتوي على الأوامر التي تنفذ عليه.\n" +
                "لغات أخرى أكثر عمومية تعمل بشكل مستقل عن نوع الآلة، أي أنها تعمل ضمن آلة افتراضية، مثل لغة جافا\n" +
                "وعموما: فإن لكل لغة برمجة خصائصها التي تميزها عن الأخرى وتجعلها مناسبة بدرجات متفاوتة لكل نوع من أنواع البرامج والمهام المطلوبة من هذا البرنامج.\n" +
                "\n" +
                "كما أن للغات البرمجة أيضاً خصائص مشتركة وحدود مشتركة بحكم أن كل هذه اللغات صممت للتعامل مع الحاسب.", R.drawable.ic_baseline_send_24));
        adabters.add(new adabter("معلومات عن العلماء وقصص حياتهم","العلماء التطوّر العلمي الكبير والتكنولوجيا العظيمة، والتي حوّلت الكرة الأرضيّة على اتساعها إلى قريةٍ صغيرة، لم تكن وليدة اللحظةِ أو الصدفة، ولم يأتِ هذا التطوّر العظيم من فراغٍ، بل كان بفضل مجهودٍ شاق وعظيم، وإسهامات هائلة من قِبَل الكثير من العلماء والمخترعين والباحثين من شتى أرجاء المعمورة، وقد أفنى هؤلاء حياتهم في الدراسة والبحث والتأمل وخدمة العلم والعلوم المتنوعة، بإخلاصٍ وتفانٍ للرقي بأنفسهم وبالبشريّة جمعاء. لولا تلك الثورات العلميّة والمجهود العظيم الذي بذله هؤلاء، ما كنا لَنصل إلى هذا التقدّم العلمي والتكنولوجي الكبير الذي يشهده عصرنا الحالي على جميع الأصعدة، وفي سياق حديثي سأذكر بعضاً من هؤلاء العلماء وهم كثيرون بحيث لا يستوعب بحثٌ واحد حصر أسمائهم وإنجازاتهم العظيمة، ومنهم: أهم العلماء من أهم العلماء الذين أثروا على حياتنا في جميع المجالات، هم: ماري كوري عالمةٌ من بولندا، تخصّصت في مجال الفيزياء والكيمياء، وتعتبر كوري رائدة في دراسة مجال النشاط الإشعاعي، وهي أيضاً الوحيدة التي حصدت جائزة نوبل في حقلين مختلفين من العلوم. تُعتبر كوري أوّل سيدةٍ عملت على التدريس في جامعة باريس، وقامت بتأسيس معاهد (كوري) في بولندا وفرنسا. من أهم إنجازات ماري كوري، إنشاؤها لنظريّة صاغت المصطلح فيها بنفسها، وأطلقت عليها نظريّة النشاط الإشعاعي، بالإضافة لهذا قامت باكتشاف اثنين من العناصر الكيميائيّة وهما البولونيوم والراديوم، بالإضافة لهذا فقد قامت كوري برعاية الدراسات الأولى على مستوى العالم، والتي تمّت لإيجاد علاجٍ لمرض السرطان، باستخدام النظائر المشعّة. آلان تورنج هو الأب الروحي لعلم الحاسوب الحديث، آلان تورنج عالم رياضيّات إنجليزي، عمل على دراسة الرياضيّات في جامعة (كامبريج)، ثم عمل مدرساً فيها في وقتٍ لاحق. قام تورنج بوضع مفهومٍ ينصّ على أنه لا يمكن حساب أو حلّ المشاكل الرياضيّة بوساطة الطريقة التلقائيّة، وقد اعتبر مفهومه هذا أساساً لمفاهيم الحسابات الحديثة، ويُعرف هذا المفهوم حاليّاً باسم (آلة تورنج). تأتي أهمية هذا المفهوم ببساطته مقارنةً مع التفاصيل المعقدة لجهاز الحاسوب، وعلى الرغم من بساطته إلاَّ أنّه قادرٌ على تنفيذ جميع القواعد الخوارزميّة القابلةِ للتنفيذ بوساطة أحدث أجهزة الحاسوب المتطوّرة، ولهذا فإنّه يمكن فحص العمليّات الحسابيّة بوساطة آلة تورنج لمعرفة قابليتها للتنفيذ بواسطة الحاسوب أم لا، ويُطلق على هذه العمليّة اسم (قابليّة الحساب). قد كان لتورنج خلال الحرب العالميّةِ الثانيّة دور بارز في عمليّة فك شيفرات البحريّةِ الألمانيّة، لتوفير معلوماتٍ مهمة وحيوية لأجهزة المخابرات البريطانيّة وقوّات الحلفاء. نيلز بور بور هو عالمٌ فيزيائيّ من الدنمارك، وله العديد من الإسهامات البارزة لصياغة وفهم ميكانيكا الكم والبنيةِ الذريّة، وهذه الأسباب أسهمت في حصوله على جائزة نوبل. شغل نيلز رئاسة لجنة (الطاقة الذريّة الدنماركيّة)، وكان أيضاً رئيساً لمعهد كوبنهاجن للعلوم الطبيعيّة النظريّة، وبعد أبحاثٍ عديدة قام بتقديم نظريته حول بناء الذرّة، وقد صُنف عالِمُنا هذا على أنه أحد أهم علماء الفيزياء وأكثرهم تأثيراً في القرن الماضي. ماكس بلانك عالمٌ فيزيائي من ألمانيا، وهو مؤسس نظريّة الكم، يُعتبر بلانك أحد أهم علماء الفيزياء في القرن الماضي، وقد قام بتقديم العديد من الإسهامات البارزة في مجال الفيزياء النظريّة، وكان لنظريّة الكم التي أنشأها ثورةً في مفهوم كلّ ما هو ذري وما هو دون ذلك، وهي تعادل في أهميتها النظريّة النسبيّة لأينشتاين. أدت الاكتشافات التي توصّل لها بلانك إلى تطوير العديد من التطبيقات في المجالات الصناعيّةِ والعسكريّة، والتي لها تأثيرٌ مهم على جميع الصعد في عصرنا الحديث. كان بلانك معادياً للنازيّة، وأدى هذا الأمر إلى إعدام ابنه لمشاركته في مؤامرة فاشلة كانت تهدف إلى اغتيال هتلر. تشارلز داروين داروين هو جيولوجي وعالمُ تاريخٍ طبيعي بريطاني، عمل على إطلاق نظريّة التطوّر التي أكسبته شهرةً واسعة، وقد نصّت نظرية التطور على أن جميع المخلوقات الحيّة قد انحدرت من أسلافٍ مشتركة، وأن أصل الإنسان والقرد واحد. عمل داروين على تطوير نظريته في الانتخاب الطبيعي، لكنه لم يقُم بنشرها لإدراكه مدى خطورة ردود الفعل حول هذا التطوير الذي قام به لنظريته، لكنه قام بعد فترة بنشرها لعلمه باشتغال عالمٍ آخر على نظريةٍ تشابه نظريته. يعتبر داروين أحد أهم وأشهر علماء الأحياء، وله العديد من الكتب والمؤلفات في هذا المجال، أما نظريته التي قام بتطويرها فقد واجهت سيلاً من الانتقادات، لا سيما من قِبَل رجال الدين في جميع أنحاء العالم. ليوناردو دافينشي دافينشي هوخبيرٌ في علم الرياضيّات، وموسوعي، ومهندس، ومخترع، ورسامٌ، ونحّات، وخبير تشريحٍ، ومعماري، وعالم نباتٍ، وكاتبٌ، وموسيقي إيطالي، عُرف بشغفه الدائم في البحث العلمي والاكتشاف، وقد وصِفَ بأنّه رجل النهضة في إيطاليا. له العديد من الاختراعات والإنجازات المهمّة على جميع الأصعدة، ومن أشهر أعماله لوحتا الموناليزا والعشاء الأخير. جاليليو جاليلي عالم فلكٍ وفيزيائي إيطالي، من أهم إنجازاته العمل على تطوير التلسكوب وإدخال العديد من التحسينات عليه، ولُقب بوالد علم الفلك الحديث وأب الفيزياء والعلم. عمل جاليلي على اتبّاع الطرق التجريبيّة في بحوثه العلميّة، ووضع بحثاً في الحركة النسبيّة وحركة الجسم على المستوى المائل، في لحظة إلقاء جسم ما في زاويةٍ مع الأفق وسقوط الأجسام واستخدام البندول لقياس الزمن، وعمل على إدخال العديد من التحسينات على البوصلة، وعمل على اختراع الترموميتر. السنوات الأخيرة من عمر جاليليو أمضاها في الإقامةِ الجبريّة في منزله، بعد الحكم الذي أصدرته محاكم التفتيش في بلاده، وذلك نتيجةً لآرائه المخالفة للكنيسةِ التي كانت تسيطر على جميع أشكال الحياة في الدولة في ذلك الوقت. نيكولا تيسلا تيسلا اعتُبر من أهمّ مخترعي العصر الحديث، هو عالمٌ ومهنسٌ ومخترعٌ من صربيا، له العديد من الإسهامات البارزة في مجال الطاقةِ الكهرومغناطيسيّة، قام نيكولا باختراع المحرك الكهربائي بعد أن وضعت براءات اختراعاته ونظريّاته جميع الأسس للطاقة الكهربائيّة ذات التيارين المتردد أو المتناوب، وقد كانت لهذه الاختراعات الفضل في النهوض بالثورة الصناعيّة الثانية. أيضاً عمل نيكولا على اختراع الراديو، وله إسهامات عديدة وبالغة الأهميّة في مجالات الاتصالات اللاسلكيّة، وأيضاً في مجال تطوير الرادار والإنسان الآلي وعلوم الكمبيوتر وعمليّة التحكّم عن بعد، بالإضافة للفيزياء النوويّة والنظريّة والتمدد البالستي. أُطلق عليه العديد من الألقاب، منها القديس، وشفيع الكهرباء الحديثة، وأبو الفيزياء، والرجل الذي اخترع القرن العشرين. ألبرت أينشتاين عالمٌ وفيزيائي ألماني، من أشهر نظرياته النظريّة النسبيّة، والتي أسهمت في حصوله على جائزة نوبل في حقل الفيزياء. اكتشف أينشتاين قانون (التأثير الكهروضوئي)، وقد اعتبر أحد أهم وأشهرعلماء الفيزياء على الإطلاق. اشتهر أينشتاين بلقب (أبو النسبيّة) نسبةً لنظريتيه (النسبيّة العامة والخاصة)، والتي اعتبرتا اللبنة الأولى للفيزياء (النظريّة الحديثة)، وله أبحاثٌ عديدة في الطاقة وميكانيكا الكم وتكافؤ المادة، وكانت لهذه الأبحاث والنظريات السبب في تفسير العديد من الظواهر التي فشلت في إثباتها الفيزياء الكلاسيكيّة. اعتبر أينشتاين بأنه شخصيّة القرن، وقد اعتبر اسمه مرادفاّ لمفهوم العبقريّة. إسحق نيوتن نيوتن هو عالم فلكٍ ورياضيّات وكيميائي ولاهوتي وفيلسوف، ويُعتبر من أهمّ وأكثر الرجال تأثيراً في التاريخ البشري، واعتبر كتابه (الأصول الرياضيّة للفلسفةِ الطبيعيّة) من أهم الكتب التي كان له الأثر الكبير في تاريخ العلم. قام نيوتن بتقديم قانون الجاذبيّة الأرضيّة، وله العديد من الإسهامات في مجال البصريّات، وساهم في وضع الأسس في التفاضل والتكامل، بالإضافة لهذا عمل على صياغة قانون الجذب العام وقوانين الحركة والعديد من الإنجازات الكثيرة الأخرى، كنظريّة الألوان وغيرها. يُعتبر نيوتن من أهم وأكثر من أفاد العلم على مدار التاريخ.\n" +
                "\n", R.drawable.ic_baseline_favorite_24));
        adabters.add(new adabter("قصص عن النجاح وتحقيق الاهداف","5 قصص قصيرة ملهمة عن النجاح في الحياة، يوجد العديد من القصص الملهمة أشخاص وصلوا إلى النجاح وصعدوا للقمة، وذلك بالرغم ظهور العديد من العقبات في الطريق، ومع ذلك استطاعوا الوصول إلى النجاح، الذين كانوا يريدونه، واليوم سوف نقص عليكم 5 قصص قصيرة ملهمة عن النجاح في الحياة حيث نجد في هذه القصص أن شخصيات أصحابها يعتزون بأنفسهم كما أنهم لديهم إدارة وإصرار كبير. المحتويات 1 قصة نجاح نيك فيوتتش 2 قصة نجاح اندريا بوتشيلي 3 قصة نجاح ايمي بوردي 4 قصة نجاح ويني هارلو 5 قصة نجاح مادلين ستيوارت 5.1 موضوعات أخرى: 6 بعض اقوال العظماء عن النجاح أصحاب هذه القصص لديهم إيمان حقيقي في طموحاتهم وأهدافهم، لذلك يفعلون كافة الأمور من أجل الوصول إلى ما يرغبون فيه، وهذا الإيمان يأتي من الثقة بالنفس ومواجهة الإحباط واليأس، لأن لديهم إصرار على النجاح لا يقهره أي شخص آخر ولا أي عقبات، لذلك سوف نتكلم عن هذه القصص الملهمة من خلال هذا المقال. قصة نجاح نيك فيوتتش ولد في استراليا عام 1982، ولد وهو فاقد كل من الذراعين والرجلين، وهذا الذي منعه من الالتحاق بالمدرسة، وكان يشعر بالاحباط والاكتئاب منذ الصغر، ولكن هذا لم يبق طويلًا، والتحق بالمدرسة إلى أن أنهى تعليمه الجامعي وحاول أن ينتحر أكثر من مرة. الزوار شاهدو أيضًا: قصص نجاح العظماء، قصص رائعة وملهمة قصة نجاح فريق عمل متعاون قصص نجاح بعد الفشل المتكرر والطويل ولكن جاءت فترة تحول في حياته، حولته إلى إنسان مفعم بالحيوية والنشاط، وبالرغم من أن نيك فيوتتش ذو إعاقة، ولكن هذه الإعاقة لم تمنعه عن الوصول إلى أهدافه، حيث أن فيوتتش أب لطفلين، وهو من أهم المحاضرين في العالم وأشهرهم. كما أنه يقوم بلعبة الجولف، ومن محبي القراءة بشغف، وأخذ يتعلم العديد من المهارات، وفي ذلك الوقت قرر أن يعيش حياة عادية مثل البشر العاديين، ومن المهارات التي اكتسبها معرفة الكمبيوتر، وتعلم الكتابة، وقام بممارسة العديد من الألعاب مثل لعبة التنس، بالإضافة إلى السباحة. وعندما كان فيوتتش في الجامعة، كان يخاطب أصدقائه بالجامعة وصار شخص مؤثرًا، وهذه كانت من أهم طموحاته، إلى أن وصل إلى نجاح كبير وأصبح أشهر محاضر في العالم قصة فيوتتش تعطي درس لمن ييأس عندما يتعرض إلى أى فشل أثناء تخطيه أول خطوه في حياته ولم ينجح. اقرأ أيضًا: قصص نجاح العظماء – قصص رائعة وملهمة قصة نجاح قصيرة من الصفر إلى العظمة قصة نجاح اندريا بوتشيلي ولد في إيطاليا عام 1952، ومنذ ولادته وهو يعاني من مشاكل في البصر، وبعد أن كبر وأثناء لعبه لكرة القدم تمت إصابته وفقد بصره، ورغم ذلك بوتشيلي كان شغوف بالغناء والموسيقى، في تعلم الموسيقى وهو صغير، وكان والده يشجعه على ذلك. تعلم الغناء من أشهر المغنيين العالميين، ولكن لم يستمر مواصلة دروس الموسيقى، لأن لا يوجد معه مال كافي، فقام بالعزف في المقاهي ليحصل على المال الذي يستطيع من خلاله إكمال دراسته واستكمل تعليمه إلى أن حصل على الدكتوراه في مجال القانون وعمل كمحامي. لكن لم يستمر في هذه الوظيفة، لأن عقله وحسه مع الموسيقي أكثر من المحاماه، ثم سلك طريق الموسيقي، وقام بعمل أغنية مع الفنانة سارة برايتمان، وصارت من أشهر الأغاني في جميع أنحاء العالم، عمل الكثير من الألبومات، وحصل على الكثير من الجوائز. وقام بوتشيلي بجولة حول العالم، وحقق بوتشيلي نجاحًا باهرًا، وإعاقة بوتشيلي لم تمنعه من الوصول إلى أحلامه هذه القصة توضح لكل إنسان أن الإعاقة لم تكن إعاقة بدن ولكن إعاقة عقل الذي يعجز الإنسان عن فعل المستحيل من أجل الوصول إلى النجاح الذي يرغب فيه مهمه تعرض للكثير من الصعوبات. قصة نجاح ايمي بوردي هذه القصة من القصص الملهمة لكل إنسان، حيث أنها لإيمي بوردي التي لديها ثقة ويقين أن الحدود هي التي تدفع الإنسان إلى النجاح، ولم تكن لتعطل مسيرة أي شخص للوصول إلى النجاح، حيث أن إيمي بوردي أصيبت بالتهاب جرثومي في السحايا و لم تتجاوز الـ 19 عام، وفقدت ساقيها الاثنتين بسبب ذلك، وحاسة السمع بالأذن اليسرى، وكانت حالة إيمي النفسية سيئة للغاية، وكانت تعيش فترات عصيبة، لا ترى في مستقبلها أي تفاؤل وأمل. في تلك الفترة تحطمت أحلام إيمي في كل شئ، كانت إيمي لا تعرف كيف تفعل لتواجه هذا العالم المرير لديها، فهي تنظر إلى كل الأمور في ذلك الوقت نظرة سوداوية، ولكن سرعان ما فكرت إيمي أنها لابد أن تراجع نفسها وتفكيرها، في أنها تعيش مثل باقي البشر، وتتأقلم مع وضعها الجديد، وواجهت واقعها بمثابرة وشجاعة، إلى أن بدأت أن تعود إلى كافة طموحاتها بالتدريج، فقامت بصنع أقدام صناعية لنفسها بنفسها. عادت إيمي مرة أخرى للتزلج على الجليد، وعادت إيمي بروح رائعة، وإرادتها وإصرارها جعلوا منها بطلة العالم في التزلج، وإيمي لها نشاطات إنسانية كثيرة، حيث قامت بتأسيس منظمة غير ربحية من أجل مساعدة الذين يعانون من إعاقة الجسد، من أجل ممارسة الرياضية بطريقة طبيعية، يتعلم الإنسان أن الإعاقة ليست هي السبب الرئيسي في عدم الوصول للنجاح، بل اليأس هو الذي يجعل الإنسان سلبي، لذلك هذه القصة تمحو اليأس. شاهد أيضًا: قصص نجاح بعد الفشل المتكرر والطويل قصص نجاح أغنى 7 رجال أعمال في العالم قصة نجاح ويني هارلو لا يوجد معايير معينة خاصة بجمال أي شخص، وهذه القصة هي من القصص الفريدة من نوعها، وهي لـ ويني هارلو عارضة الأزياء الكندية، أصيبت ويني بالبهاق منذ صغرها، وكان يسخر الكثيرون منها، لكن لم تهتم بهذه الأشياء، كانت تصر دائمًا أنها تحقق أهدافها حتى وإن سخر منها العالم بأكمله، إن ثقة ويني بنفسها كبيرة جدًا، إلى أن استطاعت أن تتخطى العديد من العقبات في طريقها للنجاح. صارت ويني من أشهر عارضات الأزياء في العالم وذلك لمواجهتها للآخرين بقوة وشجاعة كبيرة، فهي لم تكن تستمع إلى كلام الذين يسخرون منها وإلا كانت لا تصل إلى هذا، بل استمرت في طريقها إلى أن أصبحت عارضة أزياء من خلال ثقتها بنفسها وبجمالها، إلى أن دور الأزياء صارت تتسارع عليها من أجل أن تقوم بعرض أزيائهم، ويني أصبحت مشهورة عالميًا عندما تجاهلت الكلام السلبي، ونظرت إلى الإيجابية. قصة نجاح مادلين ستيوارت كانت مادلين تعاني منذ الصغر من أنها مصابة بمتلازمة داون، ولكن هذا المرض النادر لم يمنعها من المواصلة من أجل تحقيق حلمها، وهي أن تصبح عارضة أزياء كبيرة، فقامت مادلين في أول الأمر بتقليل وزنها، بالإضافة إلى الاهتمام بمظهرها، فقامت بالتقديم إلى الكثير من دور الأزياء المعروفة، ولكن لم يقبلها أي من دور الأزياء، ولكن مادلين في تلك الفترة لم تستسلم قط. كان رفض دور الأزياء لمادلين بمثابة التحدي لنفسها، وجعلها أكثر إصرارًا في أن تصبح عارضة أزياء، وحاولت مرات عديدة وفشلت، وأخذت تحاول أكثر إلى أن استطاعت أن توقع مع إحدى الشركات الخاصة بالملابس الرياضية النسائية بأمريكا، واستطاعت أن تشترك في أسبوع الموضة الذي يتم أقامته في نيويورك، لم يهدم أحلام وطموحات مادلين أي شئ بل أصبحت أكثر قوة حتى وصلت إلى النجاح.\n" +
                "\n", R.drawable.ic_baseline_person_24));


    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(getActivity(), showMoreActivity.class);
        intent.putExtra("book", adabters.get(position).getImg());
        intent.putExtra("title", adabters.get(position).getDescription());
        startActivity(intent);
    }

    @Override
    public void onLongItemClick(int position) {

    }
}
