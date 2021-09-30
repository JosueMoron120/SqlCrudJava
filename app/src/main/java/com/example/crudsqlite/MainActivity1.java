package com.example.crudsqlite;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 5, 1},
        k = 1,
        d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u0010"},
        d2 = {"Lcom/example/crudsqlite/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "addCategoryButton", "Landroid/widget/Button;", "getAddCategoryButton", "()Landroid/widget/Button;", "setAddCategoryButton", "(Landroid/widget/Button;)V", "addProductButton", "getAddProductButton", "setAddProductButton", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "CrudSqlite.app"}
)
public final class MainActivity1 extends AppCompatActivity {
    public Button addProductButton;
    public Button addCategoryButton;

    @NotNull
    public final Button getAddProductButton() {
        Button var10000 = this.addProductButton;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addProductButton");
        }

        return var10000;
    }

    public final void setAddProductButton(@NotNull Button var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.addProductButton = var1;
    }

    @NotNull
    public final Button getAddCategoryButton() {
        Button var10000 = this.addCategoryButton;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addCategoryButton");
        }

        return var10000;
    }

    public final void setAddCategoryButton(@NotNull Button var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.addCategoryButton = var1;
    }

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(1300091);
        View var10001 = this.findViewById(1000114);
        Intrinsics.checkNotNullExpressionValue(var10001, "findViewById(R.id.btn_main_add_product)");
        this.addProductButton = (Button)var10001;
        var10001 = this.findViewById(1000137);
        Intrinsics.checkNotNullExpressionValue(var10001, "findViewById(R.id.btn_main_add_category)");
        this.addCategoryButton = (Button)var10001;
        Button var10000 = this.addProductButton;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addProductButton");
        }

        var10000.setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                MainActivity.this.startActivity(new Intent(MainActivity.this.getApplicationContext(), CreateProductActivity.class));
            }
        }));
        var10000 = this.addCategoryButton;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addCategoryButton");
        }

        var10000.setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                MainActivity.this.startActivity(new Intent(MainActivity.this.getApplicationContext(), CreateCategoryActivity.class));
            }
        }));
    }
}
