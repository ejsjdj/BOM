<script setup>
import {watch} from "vue";
import {useRoute} from "vue-router";

// 라우트 객체
const route = useRoute();

</script>

<template>
    <main>
      <!-- 라우터 뷰 -->
      <router-view></router-view>
    </main>
</template>