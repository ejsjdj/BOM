import { createApp } from 'vue';
import { createPinia } from 'pinia';
import App from './App.vue';
import router from './router';

const app = createApp(App); // Vue 애플리케이션 인스턴스 생성

app.use(createPinia());     // Pinia 상태관리 플러그인을 앱에 적용
app.use(router);            // 라우터(페이지 이동 시스템) 적용

// 라우터 초기화(비동기 라우트 탐색 완전히 끝난 뒤 실행)
router.isReady().then(() => {
    app.mount('#app');      // DOM의 id가 app 인 요소에 앱을 마운트(출력 시작)
});
