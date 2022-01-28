module expenses.readers {

    requires java.base;//패키지명이 아니라 모듈명이다.
    //항상 기본적으로 필요한 모듈이라 명시적으로 정의할 필요 x

    exports com.example.expenses.readers;
    exports com.example.expenses.readers.file;
    exports com.example.expenses.readers.http;

}