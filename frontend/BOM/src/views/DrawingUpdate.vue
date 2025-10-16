<script setup>
import {addDrawing} from "@/service/drawingService";
import {useRouter} from "vue-router";
import {reactive} from "vue";

const state = reactive({
    drawing: {
        name: ""
    }
});

// 라우터 객체
const router = useRouter();

// 도면 업데이트 하기
const update = async () => {

    const res = await addDrawing(state.drawing);

    if (res.status === 200) {
    window.alert("도면을 업데이트 했습니다");
    await router.push("/");
  } else {
    window.alert(res.state);
  }
};
</script>

<template>
  <div class="drawing-update-wrapper">
    <h2>새 도면 추가</h2>
    <form @submit.prevent="update">
      <input type="text" class="form-controller" id="name" placeholder="도면번호를 추가하세요" v-model="state.drawing.name">
      <label for="name">이름</label>
      <button type="submit">추가하기</button>
    </form>
  </div>
</template>